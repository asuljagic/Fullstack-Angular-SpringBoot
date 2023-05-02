package com.ecommerce.sbecommerce.controller;

import com.ecommerce.sbecommerce.dto.Purchase;
import com.ecommerce.sbecommerce.dto.PurchaseResponse;
import com.ecommerce.sbecommerce.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController() {
    }

    @Autowired // This annotation will inject the CheckoutService bean into this constructor
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService ;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }


}
