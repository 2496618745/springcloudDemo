package com.consumer.controller;

import com.consumer.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/client/hi")
    public String sayHi() {
        return restTemplate.getForObject("http://PRODUCT-SERVER/product/getProduct", String.class);
    }

    @RequestMapping("/getOne/{id}")
    @HystrixCommand(fallbackMethod = "getOneFallBack", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})
    public String getOne(@PathVariable String id) {
        int sum = 1 / 0;
        return "true";
    }

    /**
     * 参数跟返回类型必须跟上面的一样，不然会报找不到该方法的错
     */
    public String getOneFallBack(String id) {
        return id;
    }
}
