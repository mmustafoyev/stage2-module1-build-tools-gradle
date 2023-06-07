package com.epam.demo;
import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        StringUtils functions = new StringUtils();
        for (String str : args) {
            if(!functions.isPositiveNumber(str))
                return false;
        }
        return true;
        //magic happens here
    }
}