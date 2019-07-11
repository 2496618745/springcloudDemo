package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
/**
 * 断路器
 */
@EnableCircuitBreaker
/**
 *
 * @Author: xiecan
 * @CreateDate: 2019/7/10 10:45
 * @UpdateUser: xiecan
 * @UpdateDate: 2019/7/10 10:45
 */
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


}
