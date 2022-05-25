package edu.shily.springboot01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shily-zhang
 * @Description
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){

        return "Hello,SpringBoot 2!";
    }

}
