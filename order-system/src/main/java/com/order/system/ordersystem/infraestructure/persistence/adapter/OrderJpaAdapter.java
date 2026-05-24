package com.order.system.ordersystem.infraestructure.persistence.adapter;

import com.order.system.ordersystem.domain.model.Order;
import com.order.system.ordersystem.domain.ports.OrderRepositoryPort;
import org.springframework.stereotype.Repository;

@Repository
public class OrderJpaAdapter implements OrderRepositoryPort {
    @Override
    public Order save(Order order) {
        return null;
    }
}
