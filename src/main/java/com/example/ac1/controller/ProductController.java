package com.example.ac1.controller;

import java.util.HashMap;

import com.example.ac1.model.Product;
import com.example.ac1.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProductController
 */

@Controller
@RequestMapping("/app/produto")
public class ProductController {

    @Autowired
    private ProductService ps;

    @GetMapping("/{id}")
    public ModelAndView getProductByIdControl(@PathVariable("id") int id)
    {
        ModelAndView mv = new ModelAndView("productByIdView");
        Product produtoById = ps.getProductByIdService(id);
        mv.addObject("produto", produtoById);
        return mv;
    }

    @GetMapping("/inStock")
    public ModelAndView getProductByInStockControl()
    {
        ModelAndView mv = new ModelAndView("productByInStockView");
        mv.addObject("produto", ps.getProductByInStock().values());
        return mv;
    }

    @GetMapping("/above/{value}")
    public ModelAndView getProductByAboveValue(@PathVariable("value") double value)
    {
        ModelAndView mv = new ModelAndView("productByAboveValueView");
        mv.addObject("produto", ps.getProductByAboveValue(value).values());
        return mv;
    }

    @GetMapping("/below/{value}")
    public ModelAndView getProductByBelowValue(@PathVariable("value") double value)
    {
        ModelAndView mv = new ModelAndView("productByBelowValueView");
        mv.addObject("produto", ps.getProductByBelowValue(value).values());
        return mv;
    }

}