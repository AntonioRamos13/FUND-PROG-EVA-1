/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_ciclo_for_2;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLO_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    int noCalifas;
    int sumaCalifas = 0;
    Scanner input = new Scanner(System.in)
    System.in.print.ln("Introduce el numero de calificaciones");
    noCalifas = input.nextInt();
    for(int i = 1; i <= noCalifas; i++)
    System.in.print.ln("Introduce la calificacion");
    int califa = input.nextInt();
    sumaCalifas += califa;
    double promedio = sumaCalifas / (noCalifas * 1.0);
          System.in.print.ln("El promedio es" + promedio);  
}
