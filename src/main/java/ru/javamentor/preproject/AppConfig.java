package ru.javamentor.preproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    
    @Bean
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
    
    @Bean
    @Scope("prototype")
    public Cat getCat() {
        return new Cat();
    }
}
