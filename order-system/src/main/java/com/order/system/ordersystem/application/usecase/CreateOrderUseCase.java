package com.order.system.ordersystem.application.usecase;

import com.order.system.ordersystem.domain.model.Order;
import com.order.system.ordersystem.domain.ports.OrderRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class CreateOrderUseCase {

    private final OrderRepositoryPort repositoryPort;

    public CreateOrderUseCase(OrderRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    public Order execute(String customerName, Double total) {

        Order order = new Order(customerName, total);

        return this.repositoryPort.save(order);
    }
}
