package com.uiys.thingsfordesignpattern.domain.handler.impl;

import com.uiys.thingsfordesignpattern.constant.DiscountEnum;
import com.uiys.thingsfordesignpattern.domain.OrderDiscount;
import com.uiys.thingsfordesignpattern.domain.handler.AbstractReduceMoneyBehave;
import com.uiys.thingsfordesignpattern.domain.handler.ReduceMoneyBehave;
import com.uiys.thingsfordesignpattern.dto.OrderInfo;
import com.uiys.thingsfordesignpattern.model.Coupon;
import com.uiys.thingsfordesignpattern.model.CouponDetail;
import org.springframework.stereotype.Service;

/**
 * @author :uiys
 * 减去
 */
@Service
public class ReduceMoneyByDirectlyDiscont extends AbstractReduceMoneyBehave {
    @Override
    public boolean canUse(OrderDiscount orderDiscount) {
        Boolean flag = false;
        CouponDetail couponDetail = super.getCouponDetail(orderDiscount);
        String parentUuid = couponDetail.getParentUuid();
        OrderInfo orderInfo = super.getOrderInfo(orderDiscount);
        Coupon coupon = super.getCoupon(couponDetail);
        Integer type = coupon.getType();
        if (DiscountEnum.DIRECTLY_DISCOUNT.discountType.equals(type)) {
            flag = true;
        }
        return flag;
    }

    @Override
    public ReduceMoneyBehave getReduceMoneyBehaveHandler(OrderDiscount orderDiscount) {
        return null;
    }

    @Override
    public OrderDiscount process(OrderDiscount orderDiscount) {
        return null;
    }
}
