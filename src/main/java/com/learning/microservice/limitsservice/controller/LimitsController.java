package com.learning.microservice.limitsservice.controller;

import com.learning.microservice.limitsservice.bean.Limits;
import com.learning.microservice.limitsservice.configuration.LimitsPropertyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private LimitsPropertyConfiguration limitsPropertyConfiguration;

    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(limitsPropertyConfiguration.getMinimum(), limitsPropertyConfiguration.getMaximum());
    }
}

