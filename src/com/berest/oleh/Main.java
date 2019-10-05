package com.berest.oleh;

import com.berest.oleh.arrays.Array;

public class Main {

    public static void main(String[] args) {
        run();
    }

    private static void run () {
        Array object1 = new Array();
        object1.setMax(10);
        int[] massiv = {-100, 200};
        Array object2 = new Array(massiv);

        System.out.println(object2);
        System.out.println("Max element of array: " + object2.findMaxElement());
    }
}
