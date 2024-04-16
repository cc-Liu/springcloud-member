package com.ccl.controller;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class TestController {

    @PostMapping("/testController")
    public String testController(@RequestBody String number) {
        log.info("\n好好好好好好好好好好好好好好好好好好好");
        log.error("\n好好好好好好好好好好好好好好好好");
        System.out.println(number);
        return number;
    }
}
