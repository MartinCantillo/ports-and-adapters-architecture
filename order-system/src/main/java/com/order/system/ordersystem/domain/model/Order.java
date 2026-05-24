package com.order.system.ordersystem.domain.model;

public class Order {

    private long id;
    private String customerName;
    private Double total;
    private OrderStatus orderStatus;

    public Order(long id, String customerName, Double total, OrderStatus orderStatus) {
        this.id = id;
        this.customerName = customerName;
        this.total = total;
        this.orderStatus = orderStatus;

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getTotal() {
        return total;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
