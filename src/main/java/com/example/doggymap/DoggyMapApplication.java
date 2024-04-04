package com.example.doggymap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.doggymap.repos")
@EntityScan(basePackages = "com.example.doggymap.models")
public class DoggyMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoggyMapApplication.class, args);
    }

//    public static void main(String[] args) {
//        SpringApplication.run(MandelnyamSiteApplication.class, args);
//    }

}