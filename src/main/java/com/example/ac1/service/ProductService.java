package com.example.ac1.service;

import com.example.ac1.repository.ProductRepository;
import com.example.ac1.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    public Product getProductByIdService(int id)
    {
        Product prod = pr.getProdutoById(id);
        return prod;
    }
    
}