package com.uiys.thingsfordesignpattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠券母券
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "coupon")
public class Coupon implements Serializable {
    /**
     * 优惠券的uuid
     */
    @Id
    @Column(name = "uuid")
    private String uuid;

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
     * 发布时间
     */
    @Column(name = "publish_time")
    @NotNull
    private Date publishTime;

    /**
     * 最大领取数量
     */
    @Column(name = "publish_begin_num")
    private Integer publishBeginNum;

    /**
     * 剩余数量
     */
    @Column(name = "publish_left_num")
    private Integer publishLeftNum;

    /**
     * 优惠券开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 优惠券失效时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 类型
     */
    @Column(name = "type 1:直接减免 2:直接打折")
    private Integer type;


    /**
     * 减免金额
     * Discount amount of coupons
     */
    @Column(name = "minus_amount_of_coupons")
    private BigDecimal minusAmountOfCoupons;


    /**
     * 折扣
     * Discount amount of coupons
     */
    @Column(name = "discount")
    private BigDecimal discount;




    private static final long serialVersionUID = 1L;
}