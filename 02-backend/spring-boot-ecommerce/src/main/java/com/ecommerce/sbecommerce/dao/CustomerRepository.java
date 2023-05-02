package com.ecommerce.sbecommerce.dao;

import com.ecommerce.sbecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
