package com.uiys.thingsfordesignpattern.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author :uiys
 */
@Data
public class OrderInfo {
    private String uuid;
    private BigDecimal totalMoney;
    private List<String> skuUUID;
}
