package com.uiys.thingsfordesignpattern.service.impl;

import com.uiys.thingsfordesignpattern.convert.CouponConvert;
import com.uiys.thingsfordesignpattern.domain.Coupon;
import com.uiys.thingsfordesignpattern.dto.CouponDTO;
import com.uiys.thingsfordesignpattern.mapper.CouponMapper;
import com.uiys.thingsfordesignpattern.service.CouponService;
import com.uiys.thingsfordesignpattern.util.TimeUtil;
import com.uiys.thingsfordesignpattern.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 世界上只有一种真正的英雄主义
 */

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponMapper couponMapper;

    // @Autowired
    // private CouponRepository couponRepository;

    /**
     * @param couponDTO
     * @return
     */
    @Override
    public Object add(CouponDTO couponDTO) {
        Coupon coupon = CouponConvert.convert(couponDTO);
        coupon.setUuid(UUIDUtils.getUuid());
        coupon.setCreateTime(TimeUtil.getDateTime());
        couponMapper.insert(coupon);
        return coupon.getUuid();
    }

    public static void main(String[] args) {
        System.out.println("f64a09c2cf63410ca0081ed804c2b970".length());
    }
}


