package com.espinozajgch.cv.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void testValidator(){
        String result = StringUtil.repeat("hola", 3);
        assertEquals("hola hola hola ", result);
        Assert.assertEquals("hola","hola");
    }

    @Test
    public void testNullIsEmpty(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void testIsEmpty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void testEspaceIsEmpty(){
        assertTrue(StringUtil.isEmpty("   "));
    }

    @Test
    public void testIsNotEmpty(){


        //int i=1, j=2, k=3, m=2; System.out.println ((j >= i) || (k == m));
        //int i = 7; char c = 'w'; System.out.println((i >= 6) && (c == 'w'));
        byte i = 1; byte j = 1; byte k = (byte) (i+j); System.out.println(k);
        assertFalse(StringUtil.isEmpty("no empty"));
    }

    @Test
    public void test(){
        int[] numeros = {7,4,5,2,1,10,8};

        int mayor = numeros[0];
        int menor = numeros[0];
        int posMenor = 0, posMayor = 0;

        for (int i = 0; i < numeros.length; i++) {

            /*if(numeros [i] > mayor) {
                mayor = numeros[i];
            }*/

            if(numeros[i]<menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("el menor es:" + menor + " en la pos:" + posMenor);

        //System.out.println(reducir(28,0));
    }

    public int reducir(int decimal, int i){

        if(decimal==0)
            return i;

        if(esPar(decimal)) {
            i++;
            return reducir((decimal / 2), i);
        }
        else {
            i++;
            return reducir((decimal - 1), i);
        }
    }

    public boolean esPar(int numero){
        if (numero%2==0) return true; else return false;
    }

    public static String convertirDecimalABinario(long decimal) {
        return Long.toBinaryString(decimal);
    }

    public static String convertirDecimalABinarioManual(long decimal) {
        if (decimal <= 0) {
            return "0";
        }


        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            short residuo = (short) (decimal % 2);
            decimal = decimal / 2;
            // Insertar el dígito al inicio de la cadena
            binario.insert(0, String.valueOf(residuo));
        }
        return binario.toString();
    }



}