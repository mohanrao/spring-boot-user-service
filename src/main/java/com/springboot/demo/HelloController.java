package com.springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mohanarao on 3/22/16.
 */
@RestController
public class HelloController {

    public static final String MESSAGE = "Hello world !!!!";

    @RequestMapping("/")
    public String home(){
        return MESSAGE;
    }
}
