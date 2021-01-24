package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.mail.MailHealthContributorAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author xuxueli 2018-10-28 00:38:13
 */
//没有邮箱的情况下
//@SpringBootApplication(exclude = {MailHealthContributorAutoConfiguration.class})
@SpringBootApplication
@EnableEurekaClient
public class XxlJobAdminApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlJobAdminApplication.class, args);
	}

//	@LoadBalanced
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

//	@Bean
//	@ConfigurationProperties(prefix = "datasource.druid.master")
//	public DataSource masterDataSource() {
//		return DataSourceBuilder.create().type(DruidDataSource.class).build();
//	}

}