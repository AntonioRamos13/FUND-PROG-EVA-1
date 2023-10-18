/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_8_ELSE_IF {
    
    
    public static void main(String[] args) {
        
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero del mes");
        mes = input.nextInt();
        if((mes >= 1)&& (mes <= 12)){
            if (mes == 1)
                System.out.println("enero");
            else if(mes == 2)
                System.out.println("febrero");
            else if(mes == 3)
                System.out.println("marzo");
            else if(mes == 4)
                System.out.println("abril");
            else if(mes == 5)
                System.out.println("mayo");
            else if(mes == 6)
                System.out.println("junio");        
            else if(mes == 7)
                System.out.println("julio");        
            else if(mes == 8)
                System.out.println("agosto");         
            else if(mes == 9)
                System.out.println("septiembre");         
            else if(mes == 10)
                System.out.println("octubre");        
            else if(mes == 11)
                System.out.println("noviembre");        
            else if(mes == 12)
                System.out.println("diciembre");
            else
                System.out.println("El numero no jala");
            
         
            
        }
        
    }

            
            
            
}
