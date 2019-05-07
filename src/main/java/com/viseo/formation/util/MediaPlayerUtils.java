package com.viseo.formation.util;

public class MediaPlayerUtils {

    /**
     * Static method used to get a random number in a defined range.
     * @param min the minimum limit of range
     * @param max the maximum limit of range
     * @return a random integer
     */
    public static Integer getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
