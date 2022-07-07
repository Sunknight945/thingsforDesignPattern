package com.uiys.thingsfordesignpattern.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uiys.thingsfordesignpattern.model.Coupon;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CouponMapper extends BaseMapper<Coupon> {
}