package com.engkisha.accounts.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class AccountController {
    @GetMapping("hello")
    public String sayhello() {
        return "helloVan Dung";
    }

}
