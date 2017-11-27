package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ss on 2017/11/26.
 */

@EnableAutoConfiguration
@RestController
public class Rest {

    @RequestMapping("/")
    public String hello() {
        return "Hello world from Yuntian Shen!, This is a Lab for CMPE281";
    }
}
