package com.nsgrigorjev.spring;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.nsgrigorjev.spring")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        System.out.println("!!!");
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }


}
