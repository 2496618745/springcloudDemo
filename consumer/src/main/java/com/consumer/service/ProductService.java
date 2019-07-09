package com.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author xiecan
 * @Author 2019/7/914:02
 **/

@FeignClient(name = "product-server", path = "/product")
@Component
public interface ProductService {

    @RequestMapping(value = "getProduct")
    String getProduct();

}
