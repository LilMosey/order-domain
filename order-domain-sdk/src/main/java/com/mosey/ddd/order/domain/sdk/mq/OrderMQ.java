package com.mosey.ddd.order.domain.sdk.mq;

import com.mosey.ddd.order.domain.sdk.entity.OrderEntity;

/**
 * @author TangJie
 * @since 2023/4/19
 */
public interface OrderMQ {
    void sendOrderCreateSuccessMQ(OrderEntity order);
}
