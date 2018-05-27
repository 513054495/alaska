package com.code90.studio.alaska;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 客户端启动类
 * @author Ray
 * @create 2018-05-28 0:14
 **/
@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
public class StartConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(StartConsumerApplication.class,args);
    }
}
