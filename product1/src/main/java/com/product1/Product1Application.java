package com.product1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
/**
 * @Author:         xiecan
 * @CreateDate: 2019/7/11 9:41
 * @UpdateUser:     xiecan
 * @UpdateDate:     2019/7/11 9:41
*/
public class Product1Application {

    public static void main(String[] args) {
        SpringApplication.run(Product1Application.class, args);
    }

}
