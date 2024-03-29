package com.learning.microservice.limitsservice.bean;

public class Limits {
    private Integer minimum;
    private Integer maximum;

    public Limits(Integer minimum, Integer maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @Override
    public String
    toString() {
        return "Limits{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                '}';
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    public Limits() {
    }
}
