package com.agnieszka.mucha.httpclientwithvaadin.model;

public record Weight(
        int max,
        int min
) {

    @Override
    public String toString() {
        return max +
                " - " + min +
                "kg";
    }
}
