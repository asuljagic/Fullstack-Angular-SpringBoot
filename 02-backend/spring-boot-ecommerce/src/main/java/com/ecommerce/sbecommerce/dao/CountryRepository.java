package com.ecommerce.sbecommerce.dao;

import com.ecommerce.sbecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") // This annotation will allow Angular to access the endpoint at http://localhost:8080/api/countries
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries") // This annotation will expose the endpoint at http://localhost:8080/api/countries
public interface CountryRepository extends JpaRepository<Country, Integer> {


}
