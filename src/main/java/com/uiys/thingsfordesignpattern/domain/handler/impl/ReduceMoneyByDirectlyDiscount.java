package com.uiys.thingsfordesignpattern.domain.handler.impl;

import com.uiys.thingsfordesignpattern.constant.DiscountEnum;
import com.uiys.thingsfordesignpattern.domain.OrderDiscount;
import com.uiys.thingsfordesignpattern.domain.handler.AbstractReduceMoneyBehave;
import com.uiys.thingsfordesignpattern.dto.OrderInfo;
import com.uiys.thingsfordesignpattern.model.Coupon;
import com.uiys.thingsfordesignpattern.model.CouponDetail;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author :uiys
 * 减去
 */
@Component
public class ReduceMoneyByDirectlyDiscount extends AbstractReduceMoneyBehave {
    @Override
    public boolean canUse(OrderDiscount orderDiscount) {
        Boolean flag = false;
        CouponDetail couponDetail = super.getCouponDetail(orderDiscount);
        Coupon coupon = super.getCoupon(couponDetail);
        Integer type = coupon.getType();
        if (DiscountEnum.DIRECTLY_DISCOUNT.discountType.equals(type)) {
            flag = true;
        }
        return flag;
    }


    @Override
    public OrderDiscount process(OrderDiscount orderDiscount) {
        OrderInfo orderInfo = super.getOrderInfo(orderDiscount);
        CouponDetail couponDetail = super.getCouponDetail(orderDiscount);
        Coupon coupon = super.getCoupon(couponDetail);
        BigDecimal couponDiscount = coupon.getDiscount();
        BigDecimal totalMoney = orderInfo.getTotalMoney();
        orderDiscount.setOrderUuid(orderInfo.getUuid());
        orderDiscount.setOriginCost(totalMoney);
        orderDiscount.setMinusMoney(totalMoney.subtract(totalMoney.multiply(couponDiscount)));
        orderDiscount.setAfterDiscountPay(totalMoney.multiply(couponDiscount));
        return orderDiscount;
    }
}
