package com.ecommerce.sbecommerce.dao;

import com.ecommerce.sbecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") // This annotation will allow Angular to access the endpoint at http://localhost:8080/api/products
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category") // This annotation will expose the endpoint at http://localhost:8080/api/product-category
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
