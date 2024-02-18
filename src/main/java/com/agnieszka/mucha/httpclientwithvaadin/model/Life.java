package com.agnieszka.mucha.httpclientwithvaadin.model;

public record Life(
        int max,
        int min
) {

    @Override
    public String toString() {
        return max + " - " + min + " years";
    }
}
