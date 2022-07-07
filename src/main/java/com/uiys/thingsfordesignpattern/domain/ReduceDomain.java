package com.uiys.thingsfordesignpattern.domain;

import com.uiys.thingsfordesignpattern.domain.handler.ReduceMoneyBehave;

import java.math.BigDecimal;

/**
 * @author :uiys
 */

public abstract class ReduceDomain {

    private String orderUuid;
    private Integer discountType;
    private BigDecimal totalMoney;
    private ReduceMoneyBehave reduceMoney;





}
