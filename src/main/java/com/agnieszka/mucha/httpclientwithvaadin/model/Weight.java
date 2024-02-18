package com.agnieszka.mucha.httpclientwithvaadin.model;

public class Weight {
    public int max;
    public int min;

    @Override
    public String toString() {
        return max +
                " - " + min +
                "kg";
    }
}
