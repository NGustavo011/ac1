package com.example.ac1.controller;

import java.util.HashMap;

import com.example.ac1.model.Product;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProductController
 */

@Controller
@RequestMapping("/app")
public class ProductController {

    @GetMapping("/produtos")
    public ModelAndView getProducts()
    {
        ModelAndView mv = new ModelAndView("productView");
        HashMap<String, Product> prod;
        

        return mv;
    }

}