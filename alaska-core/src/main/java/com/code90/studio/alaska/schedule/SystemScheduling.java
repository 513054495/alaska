package com.code90.studio.alaska.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 系统定时器
 * @author Ray
 * @create 2018-06-11 22:13
 **/

@Configuration
@EnableScheduling
public class SystemScheduling {
    private final Logger logger = LoggerFactory.getLogger(SystemScheduling.class);

    @Scheduled(cron="0 0/10 * * * ?")
    public void showTime(){
        logger.info("当前时间值："+System.nanoTime());
    }

}
