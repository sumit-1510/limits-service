package com.learning.microservice.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("limits-service")
public class LimitsPropertyConfiguration {
    private int maximum;
    private int minimum;

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
