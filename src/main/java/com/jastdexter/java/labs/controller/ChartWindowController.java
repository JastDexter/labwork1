package com.jastdexter.java.labs.controller;

import com.jastdexter.java.labs.model.generator.ArrayGenerator;

import java.util.ArrayList;

public class ChartWindowController {
    public ArrayList<Double> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayGenerator generator, int size, int range) {
        this.arrayList = generator.generateArray(size, range);
    }

    private ArrayList<Double> arrayList;

}
