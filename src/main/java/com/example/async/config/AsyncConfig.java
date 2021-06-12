package com.example.async.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {

    @Bean(name = "asyncExecutor")
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor asyncExecutor = new ThreadPoolTaskExecutor();
        asyncExecutor.setCorePoolSize(2);
        asyncExecutor.setMaxPoolSize(2);
        asyncExecutor.setQueueCapacity(100);
        asyncExecutor.initialize();
        return asyncExecutor;
    }
}
