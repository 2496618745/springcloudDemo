package com.product.controller;

import com.product.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author xiecan
 * @Author 2019/7/913:48
 **/

@RestController
public class ProductController {


    @RequestMapping("/getProduct")
    public String getProduct() {
        Product product = new Product();
        return product.toString();
    }
}
