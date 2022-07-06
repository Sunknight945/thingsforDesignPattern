package com.uiys.thingsfordesignpattern.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
    * 优惠券母券
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouponVO implements Serializable {
    /**
     * 优惠券的uuid
     */
    private String uuid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 发布时间
     */
    private Date publishTime;

    /**
     * 最大领取数量
     */
    private Integer publishBeginNum;

    /**
     * 剩余数量
     */
    private Integer publishLeftNum;

    /**
     * 优惠券开始时间
     */
    private Date startTime;

    /**
     * 优惠券失效时间
     */
    private Date endTime;

    /**
     * 类型
     */
    private Integer type;

    private static final long serialVersionUID = 1L;
}