/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_practico1_lab2;

import java.util.Scanner;

public class Ejercicio_practico1_Lab2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);

        System.out.println("Ingrese el primer numero");
        double A =entrada.nextDouble();
            System.out
                    .println("Ingrese el segundo numero");
            double B =entrada.nextDouble(); 
            System.out.print("El MCD de " +A);
            System.out.print(" y " +B);
            while (A!=B){
            if (A>B){
                A = A-B ;
            }else{
               if (B>A){
                   B = B-A;
                        }  
            }
            }
            System.out.println(" es:"+A);
    }
    
}


      
    
    
