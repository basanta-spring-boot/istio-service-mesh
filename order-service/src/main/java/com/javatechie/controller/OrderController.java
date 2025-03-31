package com.javatechie.controller;

import com.javatechie.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public String createOrder(@RequestBody Order order) {
        String paymentResponse = restTemplate.postForObject(
                "http://payment-service/payments",
                order,
                String.class
        );
        return "Order placed successfully! " + paymentResponse;
    }
}
