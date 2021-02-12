package com.espinozajgch.cv.util;

public class StringUtil {

    public static String repeat(String str, int times){

        String result = "";

        for (int i = 0; i < times; i++) {
            result += str + " ";
        }

        return  result;
    }

    public static boolean isEmpty(String str) {
        if(str == null) return true;
        else return str.trim().isEmpty() ? true : false;
    }
}
