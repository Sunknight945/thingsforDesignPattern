package com.uiys.thingsfordesignpattern.controller;

import com.uiys.thingsfordesignpattern.dto.CouponDTO;
import com.uiys.thingsfordesignpattern.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}


