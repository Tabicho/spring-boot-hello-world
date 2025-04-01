package com.product.service;

import com.product.model.Product;
import com.product.model.ProductResponse;
import com.product.repository.ProductRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Cacheable(value = "products", key = "#query")
    public List<ProductResponse> searchProducts(String query) {
    }

    @Cacheable(value = "product", key = "#id")
    public ProductResponse getProductById(Long id) {
      
}
}