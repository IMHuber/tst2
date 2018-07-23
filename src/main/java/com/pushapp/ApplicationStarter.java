package com.pushapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class ApplicationStarter {

    public ApplicationStarter() {
        //ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}
