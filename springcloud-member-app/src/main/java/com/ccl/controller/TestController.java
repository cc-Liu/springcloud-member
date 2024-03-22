package com.ccl.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: liuc
 * @Date: 2024/3/19 11:20
 * @Description:
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @PostMapping("/testController")
    public String testController(@RequestBody String number) {
        System.out.println(number);
        return number;
    }
}
