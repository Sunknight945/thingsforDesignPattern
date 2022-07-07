package com.uiys.thingsfordesignpattern.domain;

import com.uiys.thingsfordesignpattern.domain.handler.ReduceMoneyBehave;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @author :uiys
 * 满减或折扣的信息
 */
@Data
public abstract class ReduceDetail {

    @Autowired
    List<ReduceMoneyBehave> reduceMoneyBehaveList;

    public ReduceMoneyBehave orderDiscount(OrderDiscount orderDiscount) {
        ReduceMoneyBehave reduceMoneyBehave = reduceMoneyBehaveList.stream().filter(x -> x.canUse(orderDiscount)).findFirst().orElse(null);
        return reduceMoneyBehave;
    }


}
