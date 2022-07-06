package com.uiys.thingsfordesignpattern.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
    * 优惠券子券
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "coupon_detail")
public class CouponDetail implements Serializable {
    /**
     * 优惠券子券uuid
     */
    @Id
    @Column(name = "uuid")
    private String uuid;

    /**
     * 优惠券母券uuid
     */
    @Column(name = "parent_uuid")
    private String parentUuid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 领取用户uuid
     */
    @Column(name = "receiver_uuid")
    private String receiverUuid;

    /**
     * 领取时间
     */
    @Column(name = "receiver_time")
    private Date receiverTime;

    /**
     * 使用状态 0:未使用 1:已使用
     */
    @Column(name = "use_state")
    private Byte useState;

    private static final long serialVersionUID = 1L;
}