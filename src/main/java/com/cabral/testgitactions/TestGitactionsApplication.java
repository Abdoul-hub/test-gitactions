package com.cabral.testgitactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controllers"})
public class TestGitactionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestGitactionsApplication.class, args);
    }

}
