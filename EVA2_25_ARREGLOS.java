/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_ARREGLOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int cant;
        int[] arregloCali;
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantas calificaciones se van a capturar????");
        cant = input.nextInt();
        arregloCali = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificacion:");
            arregloCali[i] = input.nextInt();
            
            for (int j = 0; j < 10; j++) {
                System.out.println(arregloCali[j] + "-");
                
            }
        }
    }
}
