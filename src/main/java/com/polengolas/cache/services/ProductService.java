package com.polengolas.cache.services;

import com.polengolas.cache.model.Product;
import com.polengolas.cache.repository.ProductRepository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Cacheable("products")
    public Product getById(Long id){
        System.out.println("Buscando produtos");

        // simulateLatency();

        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    // private void simulateLatency() {

    //     try {
    //         long time = 1000L;
    //         Thread.sleep(time);
    //     } catch (InterruptedException e) {
    //         throw new RuntimeException(e);
    //     }
    // }

}