package com.uiys.thingsfordesignpattern.domain;

import cn.hutool.db.sql.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author :uiys
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDiscount {
    private String orderUuid;
    private String couponDetailUuid;
    private BigDecimal originCost;
    private BigDecimal minusMoney;
    private BigDecimal afterDiscountPay;

    public OrderDiscount(String orderUuid, String couponDetailUuid) {
        this.orderUuid = orderUuid;
        this.couponDetailUuid = couponDetailUuid;
    }
}
