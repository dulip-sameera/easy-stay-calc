package com.easystaycalc.app.util;

public class Validation {

    public static boolean validGuestCount(int count, int min, int max) {
        return count >= min && count <= max;

    }

}
