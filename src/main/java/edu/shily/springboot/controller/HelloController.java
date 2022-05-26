package edu.shily.springboot.controller;

import edu.shily.springboot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shily-zhang
 * @Description
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired//进行自动注入
    Car car;
    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello")
    public String handle01(){
        log.info("请求进来了.....");
        return "Hello,SpringBoot 2!";
    }

}
