package com.espinozajgch.cv.util;

public class DateUtil {

    /*
    Para determinar si un año es bisiesto o no, debemos seguir las siguientes reglas:

    1 - Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400)
    2 - Todos los años divisibles por 100 pero NO por 400 NO son bisiestos (1700, 1800, 1900)
    3 - Todos los años divisibles por 4 pero no por 100 son bisiestos (1996, 2004, 2012)
    5 - Todos los años que NO son divisibles por 4 NO son bisiestos (2017, 2018, 2019)/**/

    public static boolean isLeapYear(int year){
        return ((year % 400 == 0) || (year % 4 == 0 & year % 100 !=0));
        //if(year % 4 == 0 & year % 100 !=0) return true;
        //if(year % 4 != 0) return false;
        //else return false;
    }
}
