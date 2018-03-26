package com.jastdexter.java.labs.model.generator;

import java.util.ArrayList;

public class RandomArrayGenerator implements ArrayGenerator {
    public ArrayList<Double> generateArray(int size, int range) {
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < size; i++){
            list.add(generateElement(range));
        }
        return list;
    }

    protected Double generateElement(int range){
        return Math.random()*range;
    }
}
