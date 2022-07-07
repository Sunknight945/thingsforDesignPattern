package com.uiys.thingsfordesignpattern.domain.handler;

import com.uiys.thingsfordesignpattern.domain.OrderDiscount;
import com.uiys.thingsfordesignpattern.dto.OrderInfo;
import com.uiys.thingsfordesignpattern.mapper.CouponDetailMapper;
import com.uiys.thingsfordesignpattern.model.CouponDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author :uiys
 */
public abstract class AbstractReduceMoneyBehave implements ReduceMoneyReduceHandler {

    @Autowired
    private CouponDetailMapper couponDetailMapper;

    public OrderInfo getOrderInfo(OrderDiscount orderDiscount) {
        String uuid = "veuiyigeorderuuid";
        List<String> skuUuids = Arrays.asList("233", "244", "255");
        BigDecimal bigDecimal = new BigDecimal(1000);
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setUuid(uuid);
        orderInfo.setSkuUUID(skuUuids);
        orderInfo.setTotalMoney(bigDecimal);
        return orderInfo;
    }

    public CouponDetail getCouponDetail(OrderDiscount orderDiscount) {
        CouponDetail couponDetail = new CouponDetail();
        couponDetail.setUuid(orderDiscount.getCouponDetailUuid());
        Optional<CouponDetail> optionalCouponDetail = Optional.ofNullable(couponDetailMapper.selectOne(couponDetail));
        return optionalCouponDetail.get();
    }


}
