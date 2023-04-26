package com.ecommerce.sbecommerce.dao;

import com.ecommerce.sbecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") // This annotation will allow Angular to access the endpoint at http://localhost:8080/api/products
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable); // This method will be used to get the products by category id

    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable); // This method will be used to get the products by name containing
}
