package com.store.order.controller;


import com.store.order.dto.OrderRequest;
import com.store.order.model.Order;
import com.store.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
     orderService.placeOrder(orderRequest);
    return "order placed successfully";

    }


}
