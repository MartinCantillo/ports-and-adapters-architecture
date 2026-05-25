package com.order.system.ordersystem.entrypoint.rest.dto;

public record CreateOrderRequest (
        String customerName,
        Double total
){

};