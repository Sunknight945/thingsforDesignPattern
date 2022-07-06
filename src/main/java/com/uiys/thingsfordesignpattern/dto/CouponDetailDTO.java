package com.uiys.thingsfordesignpattern.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
    * 优惠券子券
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouponDetailDTO implements Serializable {
    /**
     * 优惠券子券uuid
     */
    private String uuid;

    /**
     * 优惠券母券uuid
     */
    private String parentUuid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 领取用户uuid
     */
    private String receiverUuid;

    /**
     * 领取时间
     */
    private Date receiverTime;

    /**
     * 使用状态 0:未使用 1:已使用
     */
    private Byte useState;

    private static final long serialVersionUID = 1L;
}