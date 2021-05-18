package org.factoriaf5.store.mode1;

import org.factoriaf5.store.controllers.ProductController;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class Product{
    private final int price;
    public String name;


    public Product (int price, String name) {
    this.price = price;
    this.name = name;

    }

public String SayHello(){
    return "Hello, my name is name"+"and I`m"+price+"years old";

}

//public class `ProductController{
       // private List<Product>Product;
        //public ProductController() {
            //product = new ArrayList<>()

        }






