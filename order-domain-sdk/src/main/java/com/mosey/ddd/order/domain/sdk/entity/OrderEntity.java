package com.mosey.ddd.order.domain.sdk.entity;

import com.mosey.ddd.order.domain.sdk.entity.objectvalue.AddressOV;
import com.mosey.ddd.order.domain.sdk.entity.objectvalue.TimeOV;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author TangJie
 * @since 2023/4/19
 */
public class OrderEntity implements Serializable {
    private static final long serialVersionUID = 2844928925904536179L;
    /**
     * 订单id
     */
    @Getter
    private Long id;

    /**
     * 收货人地址
     */
    private AddressOV customerAdd;

    /**
     * 发货地址
     */
    private AddressOV shippingAdd;

    public OrderEntity(){
    }

    public OrderEntity(Long id){
        this.id = id;
    }

    public TimeOV takeTimes(){
        return customerAdd.timeConsuming(shippingAdd);
    }

}
