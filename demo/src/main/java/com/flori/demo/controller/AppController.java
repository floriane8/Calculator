package com.flori.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String index(){
        return "welcome, to my we";
    }

    @GetMapping("/packages")
    public String index2(){
        return "Bonjour bb bienvenue dans package";
    }

    @GetMapping("/sonia") // nom de la page
    public String flori(){
        return "sonia bjr ";
    }
}
