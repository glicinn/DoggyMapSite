package com.example.doggymap.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/")
public class HomeController {

    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping("/")
    public String indexIndex() {
        return "index";
    }

    @PreAuthorize("hasAnyAuthority('user','admin','employee')")
    @GetMapping("/site/MainPage")
    public String mainIndex() {
        return "site/MainPage";
    }

    @PreAuthorize("hasAnyAuthority('user','admin','employee')")
    @GetMapping("/site/LogIn")
    public String logInIndex() {
        return "site/LogIn";
    }

    @PreAuthorize("hasAnyAuthority('user','admin','employee')")
    @GetMapping("/site/LogUp")
    public String logUpIndex() {
        return "site/LogUp";
    }

    @PreAuthorize("hasAnyAuthority('user','admin','employee')")
    @GetMapping("/site/Map")
    public String mapIndex() {
        return "site/Map";
    }

    @PreAuthorize("hasAnyAuthority('user','admin','employee')")
    @GetMapping("/site/NewsPage")
    public String newsIndex() {
        return "site/NewsPage";
    }

    @PreAuthorize("hasAnyAuthority('user','admin','employee')")
    @GetMapping("/site/Breeds")
    public String breedsIndex() {
        Logger logger = LoggerFactory.getLogger(this.getClass().getName()); //Создание логгера
        logger.error("Виу виу");
        return "site/Breeds";
    }

}

