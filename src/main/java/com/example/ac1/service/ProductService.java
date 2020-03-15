package com.example.ac1.service;

import com.example.ac1.repository.ProductRepository;

import java.util.HashMap;

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
    
    public HashMap<Integer, Product> getProductByInStock()
    {
        int cont = 0;
        HashMap<Integer, Product> produtoInStock = new HashMap<>(), product;
        product = pr.getProdutos();
        for(Product produtoAux: product.values())
            if(produtoAux.getEstoque() > 0)
                produtoInStock.put(cont++, produtoAux);
        return produtoInStock;
    }

    public HashMap<Integer, Product> getProductByAboveValue(double valor)
    {
        int cont = 0;
        HashMap<Integer, Product> produtoAboveValue = new HashMap<>(), produtoAux;
        produtoAux = pr.getProdutos();
        for(Product productAux: produtoAux.values())
            if(productAux.getValor() > valor)
                produtoAboveValue.put(cont++, productAux);
        return produtoAboveValue;
    }

    public HashMap<Integer, Product> getProductByBelowValue(double valor)
    {
        int cont = 0;
        HashMap<Integer, Product> produtoBelowValue = new HashMap<>(), produtoAux;
        produtoAux = pr.getProdutos();
        for(Product productAux: produtoAux.values())
            if(productAux.getValor() < valor)
                produtoBelowValue.put(cont++, productAux);
        return produtoBelowValue;
    }
}