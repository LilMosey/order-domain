package com.mosey.ddd.order.domain.runtime.service;

import com.mosey.ddd.order.domain.sdk.entity.OrderEntity;
import com.mosey.ddd.order.domain.sdk.mq.OrderMQ;
import com.mosey.ddd.order.domain.sdk.repository.OrderRepository;
import com.mosey.ddd.order.domain.sdk.service.OrderDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Service
public class OrderDomainServiceImpl implements OrderDomainService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderMQ orderMQ;

    /**
     * step1:生成订单
     * step2:发布订单创建成功领域事件（MQ）
     * @param order
     * @return
     */
    @Override
    public OrderEntity createOrder(OrderEntity order) {
        OrderEntity res = orderRepository.saveOrder(order);

        orderMQ.sendOrderCreateSuccessMQ(res);
        return res;
    }
}
