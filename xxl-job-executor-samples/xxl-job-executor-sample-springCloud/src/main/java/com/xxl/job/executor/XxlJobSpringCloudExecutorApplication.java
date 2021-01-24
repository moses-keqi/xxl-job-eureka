package com.xxl.job.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author HanKeQi
 * @Date 2020/4/15 4:15 下午
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class XxlJobSpringCloudExecutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxlJobSpringCloudExecutorApplication.class, args);
    }

}
