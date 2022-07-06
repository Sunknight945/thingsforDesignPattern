package com.uiys.thingsfordesignpattern.convert;

import cn.hutool.core.bean.BeanUtil;
import com.uiys.thingsfordesignpattern.domain.Coupon;
import com.uiys.thingsfordesignpattern.dto.CouponDTO;

/**
 * @author 世界上只有一种真正的英雄主义
 * 转换
 */

public class CouponConvert {

    public static Coupon convert(CouponDTO couponDTO) {
        Coupon coupon = new Coupon();
        BeanUtil.copyProperties(couponDTO, coupon);
        return coupon;
    }

}


