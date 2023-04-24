package com.mosey.ddd.order.domain.sdk.repository;

import com.mosey.ddd.order.domain.sdk.entity.OrderEntity;

/**
 * @author TangJie
 * @since 2023/4/19
 */
public interface OrderRepository {
    OrderEntity saveOrder(OrderEntity order);
}
