package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *消费者
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ConsumerApplication 
{
    public static void main( String[] args ) {
         SpringApplication.run(ConsumerApplication.class, args);
    }
    
    @Bean
    @LoadBalanced
    public RestTemplate getTemplate() {
    	return new RestTemplate();
    }
    
}
