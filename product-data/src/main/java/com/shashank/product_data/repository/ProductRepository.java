package com.shashank.product_data.repository;

import com.shashank.product_data.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
