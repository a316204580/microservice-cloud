package com.webank.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author PaulFang
 * @date 2019/10/14
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient //本服务启动中会自动注册进eureka服务列表中
public class DeptProvider8003_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_App.class, args);
    }
}
