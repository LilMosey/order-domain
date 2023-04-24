package com.mosey.ddd.order.domain.runtime.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@ComponentScan("com.mosey.ddd.order.domain.runtime")
@Configuration
public class OrderDomainAutoConfig {
}
