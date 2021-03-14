package com.kgc.hello.config;

import com.kgc.hello.entity.Car;
import com.kgc.hello.entity.Phone;
import com.kgc.hello.entity.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@ConditionalOnBean(name = "BMW") // 当容器中BMW这个bean没有的时候。user也不放到容器了
// @ImportResource("classpath:beans.xml")
@Import({User.class}) //导入执行的资源，把对象放入这个容器，这个id是类的全量限定名（包名 + 类名）
@Configuration(proxyBeanMethods = true) // 相当于beans.xml 就是一个配置类 == 容器
public class MyConfig {

    @Bean // 相当于容器里的bean标签，默认方法名等于标签id，返回值就是对象的实例
    public User lb() {
        //return new User("鲁班", 18);
        //return new User("鲁班", 18, car01());
        User user = new User("鲁班", 18);
        user.setCar(car01());
        return user;
    }

    //@Bean("BMW")
    public Car car01() {
        return new Car("宝马740");
    }


}
