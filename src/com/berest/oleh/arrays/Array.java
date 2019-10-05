package com.berest.oleh.arrays;

import java.util.Arrays;

public class Array {
    private int[] array;
    private int max;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Array(int max) {
        this.max = max;
    }

    public Array(int[] array) {
        this.array = array;
    }

    public Array() {
        super();
    }

    public int findMaxElement(){
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max element: " + max);
        return max;
    }


    
    void f(){}
}
