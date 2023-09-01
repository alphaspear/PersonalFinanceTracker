package com.alphaspear.pft.controller;

import lombok.extern.flogger.Flogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String SayHi(){
        return "Hello";
    }
}