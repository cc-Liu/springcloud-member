package com.ccl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: liuc
 * @Date: 2024/4/16 09:53
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = {"com.ccl.mapper"})
public class SpringCloudMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMemberApplication.class,args);
    }
}