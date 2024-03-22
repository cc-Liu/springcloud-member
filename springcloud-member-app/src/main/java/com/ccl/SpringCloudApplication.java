package com.ccl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: liuc
 * @Date: 2024/3/19 10:58
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class,args);
    }
}
