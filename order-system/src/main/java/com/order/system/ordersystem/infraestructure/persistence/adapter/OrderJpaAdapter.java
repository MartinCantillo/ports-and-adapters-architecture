package com.order.system.ordersystem.infraestructure.persistence.adapter;

import com.order.system.ordersystem.domain.model.Order;
import com.order.system.ordersystem.domain.ports.OrderRepositoryPort;
import com.order.system.ordersystem.infraestructure.entity.OrderEntity;
import com.order.system.ordersystem.infraestructure.persistence.repository.SpringDataOrderRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderJpaAdapter implements OrderRepositoryPort {

    public final SpringDataOrderRepository springDataOrderRepository;

    public OrderJpaAdapter(SpringDataOrderRepository springDataOrderRepository) {
        this.springDataOrderRepository = springDataOrderRepository;
    }

    @Override
    public Order save(Order order) {

        OrderEntity orderEntity = new OrderEntity(
                order.getCustomerName(),
                order.getTotal(),
                order.getStatus().name()
        );
        OrderEntity saved = this.springDataOrderRepository.save(orderEntity);
        order.assignId(saved.getId());
        return order;
    }
}
