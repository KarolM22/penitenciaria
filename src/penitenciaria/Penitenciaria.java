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
       int N, MESES, cif=0;//cif contador de if
       
       String nombre;
        System.out.println("DIGITE EL NUMERO DE INTERNOS EN EL PENITENCIARIO: ");
        N=leer.nextInt();
        
        String [][]reporte = new String [N][2]; // DEFINIR MATRIZ 
 
       for (int c=0;c<N;c++){
           System.out.println("DIGITE EL NOMBRE DEL INTERNO #"+(c+1));
           nombre=leer.next();
           System.out.println("DIGITE EL NUMERO DE CONDENA EN MESES");
           MESES=leer.nextInt();
           
           if(MESES<36){
           cif++;
           reporte [c][0] = nombre;
           reporte [c][1] = String.valueOf(MESES); //convierte el int a un string / MESES lo va a convertir en letras/ string
           }
           
           
       }
           
          System.out.println("EL REPORTE CON LOS INTERNIS CON UNA CONDENA MENOR A 36 MESES"); 
          
       for(int i=0;i<N;i++){ //i : contaodr del for
           
           if( (reporte[i][0] != null) && (reporte[i][1] != null)){
           System.out.println("----------------------------------------------");  
           System.out.println("Nombre del recluso: "+reporte[i][0]+" numero #"+(i+1));
           System.out.println("Condena en meses: "+reporte[i][1]);
               
       }       
       }
       System.out.println("---------------------------------------------");
        System.out.println("EL NUMERO DE INTERNOS CON MENOS DE 36 MESES DE CONDENA ES DE: "+cif);
        
    }
    
}