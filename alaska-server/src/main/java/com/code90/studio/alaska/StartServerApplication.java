package com.code90.studio.alaska;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 服务端启动类
 * @author Ray
 * @create 2017-05-21 23:57
 */
@SpringBootApplication
@ComponentScan("com.code90.studio.alaska")
@ImportResource("classpath:dubbo-server.xml")
public class StartServerApplication {
    public static void main(String[] args){
        SpringApplication.run(StartServerApplication.class,args);
    }
}
