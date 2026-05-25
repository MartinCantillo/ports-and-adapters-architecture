package com.order.system.ordersystem.infraestructure.entity;

import jakarta.persistence.*;

@Table
@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private Double total;

    private String status;

    public OrderEntity() {
    }

    public OrderEntity( String customerName, Double total, String status) {

        this.customerName = customerName;
        this.total = total;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }
}
