package com.order.system.ordersystem.infraestructure.persistence.repository;

import com.order.system.ordersystem.infraestructure.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataOrderRepository extends JpaRepository<OrderEntity, Long> {
}
