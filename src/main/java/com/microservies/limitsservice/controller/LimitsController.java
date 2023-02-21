package com.microservies.limitsservice.controller;

import com.microservies.limitsservice.configuration.LimitsConfig;
import com.microservies.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitsController {

    @Autowired
    private LimitsConfig limitsConfig;

    @GetMapping
    public Limits getLimits() {
        return new Limits(limitsConfig.getMin(), limitsConfig.getMax());
//        return new Limits(1, 2000);
    }
}
