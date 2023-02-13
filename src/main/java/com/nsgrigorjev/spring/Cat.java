package com.nsgrigorjev.spring;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("meow-meow!");
    }

    public Cat() {
        System.out.println("Cat bean is created");
    }
}
