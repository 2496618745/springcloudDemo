package com.consumer.controller;

import com.consumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author xiecan
 * @Author 2019/7/914:05
 **/

@RestController
public class ConsumerController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/getConsumer")
    public String getConsumer() {
        String result = productService.getProduct();
        return result;
    }
}
