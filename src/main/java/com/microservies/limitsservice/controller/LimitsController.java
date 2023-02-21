package com.microservies.limitsservice.controller;

import com.microservies.limitsservice.model.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitsController {

    @GetMapping
    public Limits getLimits() {
        return new Limits(1, 2000);
    }
}
