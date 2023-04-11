package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String clean = str.trim().replaceAll(",", "");
        if (clean.charAt(0) == '-') {
            return false;
        }
        if (clean.charAt(0) == '+') {
            clean = clean.substring(1);
        }
        if (clean.matches("^[0-9]+(\\.[0-9]+)?$")) {
            return true;
        }
        return false;
    }
}
