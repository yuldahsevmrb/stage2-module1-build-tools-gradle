package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            if (!arg.matches("\\d+")) { // checks if string is all digits
                return false;
            }
            if (arg.startsWith("0")) { // checks if string starts with 0
                return false;
            }
        }
        return true;
    }
}