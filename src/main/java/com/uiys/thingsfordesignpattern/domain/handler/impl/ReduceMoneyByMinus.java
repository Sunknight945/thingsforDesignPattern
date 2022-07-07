package com.uiys.thingsfordesignpattern.domain.handler.impl;

import com.uiys.thingsfordesignpattern.domain.OrderDiscount;
import com.uiys.thingsfordesignpattern.domain.handler.ReduceMoneyBehave;
import org.springframework.stereotype.Service;

/**
 * @author :uiys
 * 减去
 */
@Service
public class ReduceMoneyByMinus implements ReduceMoneyBehave {
    @Override
    public boolean canUse(OrderDiscount orderDiscount) {
        return false;
    }

    @Override
    public ReduceMoneyBehave getReduceMoneyBehaveHandler(OrderDiscount orderDiscount) {
        return null;
    }
}
