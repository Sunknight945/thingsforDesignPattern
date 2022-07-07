package com.uiys.thingsfordesignpattern.controller;

import com.uiys.thingsfordesignpattern.domain.OrderDiscount;
import com.uiys.thingsfordesignpattern.dto.CouponDTO;
import com.uiys.thingsfordesignpattern.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 世界上只有一种真正的英雄主义
 */
@RestController
@RequestMapping("coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping("add")
    public Object addCoupon(@RequestBody CouponDTO couponDTO) {
        Object add = couponService.add(couponDTO);
        return add;
    }


    @GetMapping("getCouponDiscountInfo")
    public Object getCouponDiscountInfo(@RequestBody OrderDiscount orderDiscount) {
        Object object = couponService.getCouponDiscountInfo(orderDiscount);
        return object;
    }




}


