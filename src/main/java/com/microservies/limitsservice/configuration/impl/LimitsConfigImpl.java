package com.microservies.limitsservice.configuration.impl;

import com.microservies.limitsservice.configuration.LimitsConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("limits-service")
public class LimitsConfigImpl implements LimitsConfig {
    private int min;
    private int max;
}
