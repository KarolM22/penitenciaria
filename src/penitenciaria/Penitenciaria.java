/*
 * 5. Un centro penitenciario tiene N internos registrados y requiere un reporte con el nombre y 
la condena (en meses) de los internos con menos de 36 meses de condena. 
También debe mostrar la cantidad de internos que cumplen con dicha condición.
 */
package penitenciaria;

import java.util.Scanner;

/**
 *
 * Karol Martinez C
 */
public class Penitenciaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int N, c=1, MESES, cif=0;//cif contador de if
       String nombre;
        System.out.println("DIGITE EL NUMERO DE INTERNOS EN EL PENITENCIARIO: ");
        N=leer.nextInt();
 
       while (c<=N){
           System.out.println("DIGITE EL NOMBRE DEL INTERNO #"+c);
           nombre=leer.next();
           System.out.println("DIGITE EL NUMERO DE CONDENA EN MESES");
           MESES=leer.nextInt();
           
           if(MESES<36){
           cif++;
           }
           
           
          c++;
       }
        System.out.println("EL NUMERO DE INTERNOS CON MENOS DE 36 MESES DE CONDENA ES DE: "+cif);
        
    }
    
}
