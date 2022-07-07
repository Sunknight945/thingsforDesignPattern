package com.uiys.thingsfordesignpattern.domain.handler;

import com.uiys.thingsfordesignpattern.domain.OrderDiscount;

/**
 * @author :uiys
 */
public interface ReduceMoneyReduceHandler extends ReduceMoneyBehave {
    OrderDiscount process(OrderDiscount orderDiscount);
}
