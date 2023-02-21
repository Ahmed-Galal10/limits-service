package com.microservies.limitsservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public interface LimitsConfig {
    int getMin();

    int getMax();
}
