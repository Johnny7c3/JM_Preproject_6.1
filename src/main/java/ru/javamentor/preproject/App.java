package ru.javamentor.preproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        HelloWorld helloWorld1 = context.getBean("getHelloWorld", HelloWorld.class);
        HelloWorld helloWorld2 = context.getBean("getHelloWorld", HelloWorld.class);
        
        Cat cat1 = context.getBean("getCat", Cat.class);
        Cat cat2 = context.getBean("getCat", Cat.class);
        
        System.out.println(helloWorld1 == helloWorld2);
        System.out.println(cat1 == cat2);
    }
}
