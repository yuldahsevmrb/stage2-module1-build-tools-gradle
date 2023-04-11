package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isDigits(str)) {
            return Long.parseLong(str) > 0;
        } else if (NumberUtils.isCreatable(str)) {
            return Double.parseDouble(str) > 0;
        } else {
            return false;
        }
    }
}
