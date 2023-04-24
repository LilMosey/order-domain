package com.mosey.ddd.order.domain.sdk.service;

import com.mosey.ddd.order.domain.sdk.entity.OrderEntity;

/**
 * @author TangJie
 * @since 2023/4/19
 */
public interface OrderDomainService {
    OrderEntity createOrder(OrderEntity order);
}
