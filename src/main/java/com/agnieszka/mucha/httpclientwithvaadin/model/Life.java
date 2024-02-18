package com.agnieszka.mucha.httpclientwithvaadin.model;

public class Life{
    public int max;
    public int min;

    @Override
    public String toString() {
        return max +" - "+min+" years";
    }
}
