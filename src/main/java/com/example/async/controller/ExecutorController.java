package com.example.async.controller;

import com.example.async.model.IntegrationRequest;
import com.example.async.service.ExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("executor")
public class ExecutorController {

    @Autowired
    private ExecutorService executorService;

    @PostMapping(value = "/integration")
    public @ResponseBody ResponseEntity<String> integration(@RequestBody IntegrationRequest request) {
        executorService.getTasks();
        System.out.println("endpoint end");
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
