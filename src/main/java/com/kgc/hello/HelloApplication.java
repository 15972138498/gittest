package com.kgc.hello;

import com.kgc.hello.entity.Phone;
import com.kgc.hello.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

// 启动类，主配置
@EnableConfigurationProperties(Phone.class)
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        // 启动获取容器
        ConfigurableApplicationContext run = SpringApplication.run(HelloApplication.class, args);
//
//        // 从容器获取User对象
//        User lb = run.getBean("lb", User.class);
//        // 从容器获取car对象
//        Car bmw = run.getBean("BMW", Car.class);
//
//        System.out.println(lb);
//        System.out.println(bmw);
//
//        MyConfig bean = run.getBean(MyConfig.class);
//
//        System.out.println(bean);
//
//        User lb1 = bean.lb();
//        User lb2 = bean.lb();
//        System.out.println("lb1 == lb2：" + (lb1 == lb2));
//
//        // 判断鲁班的这个车是不是等于容器中的对象
//        System.out.println("---------------" + (lb1.getCar() == bean.car01()));


        // 根据类型 获取这个类型在容器中所有的名称，相当于获取bean的id
        String[] names = run.getBeanNamesForType(User.class);
        for (String name : names) {
            System.out.println("getBeanNamesForType：" + name);
        }

        // 注释了bwm的bean注解
        // 1.查看bwm在容器中是否还存在
        // 2.lb是否还存在
        boolean bwm = run.containsBean("BWM");
        boolean lb = run.containsBean("lb");
        System.out.println("bwm是否在容器中存在" + bwm);  //false
        System.out.println("lb是否在容器中存在" + lb);    //true

    }

}
