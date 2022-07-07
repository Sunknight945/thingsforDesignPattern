package com.uiys.thingsfordesignpattern.domain.handler.impl;

import com.uiys.thingsfordesignpattern.domain.OrderDiscount;
import com.uiys.thingsfordesignpattern.domain.handler.AbstractReduceMoneyBehave;
import com.uiys.thingsfordesignpattern.domain.handler.ReduceMoneyBehave;
import com.uiys.thingsfordesignpattern.model.CouponDetail;
import org.springframework.stereotype.Service;

/**
 * @author :uiys
 */
@Service
public class ReduceMoneyByDiscount extends AbstractReduceMoneyBehave {
    @Override
    public boolean canUse(OrderDiscount orderDiscount) {
        CouponDetail couponDetail = super.getCouponDetail(orderDiscount);
        return false;
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
