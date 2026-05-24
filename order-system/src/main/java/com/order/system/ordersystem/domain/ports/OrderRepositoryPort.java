package com.order.system.ordersystem.domain.ports;

import com.order.system.ordersystem.domain.model.Order;

public interface OrderRepositoryPort {

    Order save(Order order);
}
