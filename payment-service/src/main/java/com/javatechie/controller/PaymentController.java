package com.javatechie.controller;
import com.javatechie.dto.Order;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping
    public String processPayment(@RequestBody Order order) {
        return "Payment successful for Order ID: " + order.getOrderId();
    }
}
