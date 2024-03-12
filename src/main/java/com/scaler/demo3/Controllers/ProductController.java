package com.scaler.demo3.Controllers;

import com.scaler.demo3.Models.Cart;
import com.scaler.demo3.Services.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private CartService productService;

    public ProductController(CartService productService){
        this.productService=productService;
    }


    @GetMapping("/products")
    public List<Cart> getAllProducts(){
        return productService.getAllProducts();
    }
}
