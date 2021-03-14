package com.kgc.hello.controller;

import com.kgc.hello.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * 自动注入一共三种方式
     * 1.属性注入
     * 2.set注入
     * 3.构造方法注入
     * 现在spring不推荐第一种     */
    private final Phone phone;

    public HelloController(Phone phone) {
        this.phone = phone;
    }

    @GetMapping
    public String sayHello(String name) {
        return "Hello SptingBoot,欢迎:" + name;
    }

    @GetMapping("phone")
    public Phone getPhone() {
        return phone;
    }

}
