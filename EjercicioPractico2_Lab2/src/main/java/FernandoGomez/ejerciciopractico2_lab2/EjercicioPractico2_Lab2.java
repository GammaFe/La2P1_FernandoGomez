/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package FernandoGomez.ejerciciopractico2_lab2;

import java.util.Scanner;

public class EjercicioPractico2_Lab2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        
        System.out.println("Ingrese su Año de nacimiento");
        int i =entrada.nextInt();
        if ((i>=1946)&&(i<=1964)){
            System.out.println("Felicidades usted es de la generacion Baby boomer Gen");
        }else{
            if((i>=1960)&&(i<=1979)){
                   System.out.println("Felicidades usted es de la generacion X");
            }else{
                if((i>=1975)&&(i<=1985)){
                   System.out.println("Felicidades usted es de la generacion Xennials");
                }else{
                    if((i>=1980)&&(i<=1994)){
                   System.out.println("Felicidades usted es de la generacion Millenial");
                    }else{
                   if((i>=1990)&&(i<=2012)){
                          System.out.println("Felicidades usted es de la generacion Gen Z");
                   }else{
                       if((i>=2013)&&(i<=2025)){
                        System.out.println("Felicidades usted es de la generacion Gen Alpha");

                       }

                   }

                }
                }

                
            }
        }
        
        
        
        
 
    }
}
