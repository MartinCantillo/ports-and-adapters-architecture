package com.order.system.ordersystem.domain.model;

public class Order {

    private long id;
    private String customerName;
    private Double total;
    private OrderStatus status;

    public Order(String customerName, Double total) {
        this.customerName = customerName;
        this.total = total;
        this.status = OrderStatus.CREATED;
    }
    public void assignId(Long id) {
        this.id = id;
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

    public OrderStatus getStatus() {
        return status;
    }
}
