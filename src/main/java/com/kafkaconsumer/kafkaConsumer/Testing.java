package com.kafkaconsumer.kafkaConsumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {

    @GetMapping("/msgfromother")

    public String getmsgFromOtherBranch(){

        return "Hello world from branch dev";
    }

}