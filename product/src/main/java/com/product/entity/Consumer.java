package com.product.entity;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author xiecan
 * @Author 2019/7/913:50
 **/
public class Consumer {
    private String name;
    private int age;
    private String add;
    private String email;

    public Consumer() {
        this.name = "name";
        this.age = 12;
        this.add = "北京市历史互通";
        this.email = "6666.qq.com";
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
