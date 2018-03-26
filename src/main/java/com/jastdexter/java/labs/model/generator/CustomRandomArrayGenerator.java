package com.jastdexter.java.labs.model.generator;

public class CustomRandomArrayGenerator extends RandomArrayGenerator {
    @Override
    protected Double generateElement(int range) {
        return Math.random() * range;
    }
}
