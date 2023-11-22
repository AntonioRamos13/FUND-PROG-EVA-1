/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_31__for_each;

/**
 *
 * @author Usuario
 */
public class EVA2_31__FOR_EACH {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arreglo = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)Math.random() * 100;
                    }
        
        for (int i : arreglo)
            System.out.println("[" + valor +"]");
        String cadenas[] = new String [5];
            cadenas[0] = "";
            cadenas[1] = "";
            cadenas[2] = "";
            cadenas[3] = "";
            cadenas[4] = "";
            System.out.println("cade");
    }
}
