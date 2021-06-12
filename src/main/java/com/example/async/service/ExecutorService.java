package com.example.async.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExecutorService {

    @Async("asyncExecutor")
    public void getTasks() {

        try {
            Thread.sleep(5000);
            System.out.println("thread end");
        } catch (Exception e) {
            log.error("Error executor");
        }
    }
}
