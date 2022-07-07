package com.uiys.thingsfordesignpattern.domain;

import com.uiys.thingsfordesignpattern.domain.handler.ReduceMoneyBehave;
import com.uiys.thingsfordesignpattern.domain.handler.ReduceMoneyReduceHandler;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author :uiys
 * 满减或折扣的信息
 */
@Component
public class ReduceDetail {

    @Autowired
    List<ReduceMoneyReduceHandler> reduceMoneyReduceHandlerList;

    public ReduceMoneyReduceHandler orderDiscount(OrderDiscount orderDiscount) {
        ReduceMoneyReduceHandler moneyReduceHandler = reduceMoneyReduceHandlerList.stream().filter(x -> x.canUse(orderDiscount)).findFirst().orElse(null);
        return moneyReduceHandler;
    }


}
