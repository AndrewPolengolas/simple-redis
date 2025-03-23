package com.polengolas.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polengolas.cache.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
