package com.webank.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @author PaulFang
 * @date 2019/10/26
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudCloud {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudCloud.class, args);
    }
}
