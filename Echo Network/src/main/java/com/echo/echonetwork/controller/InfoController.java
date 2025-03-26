package com.echo.echonetwork.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @RequestMapping("/")
    public String index() {
        return "Server is up!";
    }
}
