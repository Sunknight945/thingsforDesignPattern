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
 */
@Component
public class ReduceMoneyByDirectlyMinus extends AbstractReduceMoneyBehave {
    @Override
    public boolean canUse(OrderDiscount orderDiscount) {
        Boolean flag = false;
        CouponDetail couponDetail = super.getCouponDetail(orderDiscount);
        Coupon coupon = super.getCoupon(couponDetail);
        Integer type = coupon.getType();
        if (DiscountEnum.DIRECTLY_MINUS.discountType.equals(type)) {
            flag = true;
        }
        return flag;
    }


    @Override
    public OrderDiscount process(OrderDiscount orderDiscount) {
        OrderInfo orderInfo = super.getOrderInfo(orderDiscount);
        CouponDetail couponDetail = super.getCouponDetail(orderDiscount);
        Coupon coupon = super.getCoupon(couponDetail);
        BigDecimal minusAmountOfCoupons = coupon.getMinusAmountOfCoupons();
        orderDiscount.setOrderUuid(orderInfo.getUuid());
        BigDecimal totalMoney = orderInfo.getTotalMoney();
        orderDiscount.setOriginCost(totalMoney);
        orderDiscount.setMinusMoney(minusAmountOfCoupons);
        orderDiscount.setAfterDiscountPay(totalMoney.subtract(minusAmountOfCoupons));
        return orderDiscount;
    }
}
