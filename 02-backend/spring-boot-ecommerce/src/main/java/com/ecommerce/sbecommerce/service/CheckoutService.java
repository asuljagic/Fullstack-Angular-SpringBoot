package com.ecommerce.sbecommerce.service;

import com.ecommerce.sbecommerce.dto.Purchase;
import com.ecommerce.sbecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
