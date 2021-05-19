package org.factoriaf5.store.controllers;


import org.factoriaf5.store.mode1.Product;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    public List<Product> products = new ArrayList<>();

    @GetMapping("/products")
    public List<Product> allProducts() { return products; }

    @PostMapping("/products")
    public void addProduct(Product product){ products.add(product);
        products.add(product);

    }

         }





