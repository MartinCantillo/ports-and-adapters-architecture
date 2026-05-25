package com.order.system.ordersystem.entrypoint.rest.controller;


import com.order.system.ordersystem.application.usecase.CreateOrderUseCase;
import com.order.system.ordersystem.domain.model.Order;
import com.order.system.ordersystem.entrypoint.rest.dto.CreateOrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final CreateOrderUseCase useCase;

    public OrderController(CreateOrderUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public Order create(@RequestBody CreateOrderRequest request) {

        return useCase.execute(
                request.customerName(),
                request.total()
        );
    }
}
