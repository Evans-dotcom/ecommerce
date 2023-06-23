package com.tutorial.ecommerce.model.Dao;

import com.tutorial.ecommerce.model.Product;
import org.springframework.data.repository.ListCrudRepository;

/**
 * Data Access Object for accessing Product data.
 */
public interface ProductDAO extends ListCrudRepository<Product,Long> {
}
