package com.uiys.thingsfordesignpattern.domain.handler;

import com.uiys.thingsfordesignpattern.domain.OrderDiscount;

/**
 * @author uiys
 * 减少钱的行为
 * 减少
 */
public interface ReduceMoneyBehave {

    boolean canUse(OrderDiscount orderDiscount);

    ReduceMoneyBehave getReduceMoneyBehaveHandler(OrderDiscount orderDiscount);

}
