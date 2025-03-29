package com.internship.logic;

import java.util.Arrays;
import java.util.Objects;

public class Histogram {
    private final int[] histogram;

    public Histogram(String string){
        this.histogram = new int[128];
        for (int i = 0; i < string.length(); i++){
            histogram[string.charAt(i)] ++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Histogram histogram1)) return false;
        return Objects.deepEquals(histogram, histogram1.histogram);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(histogram);
    }
}
