package com.ecommerce.sbecommerce.dao;

import com.ecommerce.sbecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
