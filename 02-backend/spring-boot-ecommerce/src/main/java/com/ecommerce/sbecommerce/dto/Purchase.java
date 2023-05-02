package com.ecommerce.sbecommerce.dto;

import com.ecommerce.sbecommerce.entity.Address;
import com.ecommerce.sbecommerce.entity.Customer;
import com.ecommerce.sbecommerce.entity.Order;
import com.ecommerce.sbecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
