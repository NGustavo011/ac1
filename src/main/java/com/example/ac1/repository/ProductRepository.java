package com.example.ac1.repository;

import java.util.HashMap;
import com.example.ac1.model.Product;


import org.springframework.stereotype.Repository;

/**
 * ProductRepository
 */
@Repository
public class ProductRepository {
    public HashMap<Integer, Product> hm = new HashMap<Integer, Product>();

    public ProductRepository() {
        hm.put(1, new Product(1, "Ziggs", 4800, 15));
        hm.put(2, new Product(2, "Soraka", 450, 22));
        hm.put(3, new Product(3, "Ahri", 4800, 10));
        hm.put(4, new Product(4, "Talon", 4800, 11));
        hm.put(5, new Product(5, "Jinx", 4800, 13));
        hm.put(6, new Product(6, "Thresh", 4800, 28));
        hm.put(7, new Product(7, "Kha'Zix", 4800, 12));
        hm.put(8, new Product(8, "Yasuo", 6300, 0));
        hm.put(9, new Product(9, "Miss Fortune", 3150, 25));
        hm.put(10, new Product(10, "Udyr", 1350, 1));
    }

    public Product getProdutoById(int id)
    {
        return hm.get(id);
    }

    public HashMap<Integer, Product> getProdutos()
    {
        return hm;
    }
}