/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package FernandoGomezejerciciopractico3_lab2;

import java.util.Scanner;

public class EjercicioPractico3_Lab2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        System.out.println("Hada 1, Hierro2, Luchador3, Psiquico4");
        System.out.println("Ingrese el tipo del Atacador");
        int a =entrada.nextInt();
        System.out.println("Ingrese el tipo del Atacado");
        int b =entrada.nextInt();
        if ((a==1)&&(b==1)){
            System.out.println("Su ataque fue neutral");
        }else if((a==1)&&(b==2)){
            System.out.println("Su ataque fue poco eficaz");
        }else if ((a==1)&&(b==3)){
            System.out.println("Su ataque fue supereficaz");
        }else if((a==1)&&(b==4)){
            System.out.println("Su ataque fue neutral");
        }else if((a==2)&&(b==1)){
            System.out.println("Su attaque fue poco eficaz");       
        }else if((a==2)&&(b==2)){
            System.out.println("Su ataque fue poco eficaz");
        }else if ((a==2)&&(b==3)){
            System.out.println("Su ataque fue supereficaz");
        }else if((a==2)&&(b==4)){
            System.out.println("Su ataque fue neutral");
            }else if((a==3)&&(b==1)){
            System.out.println("Su attaque fue poco eficaz");       
        }else if((a==3)&&(b==2)){
            System.out.println("Su ataque fue poco eficaz");
        }else if ((a==3)&&(b==3)){
            System.out.println("Su ataque fue supereficaz");
        }else if((a==3)&&(b==4)){
            System.out.println("Su ataque fue neutral");
            }else if((a==4)&&(b==1)){
            System.out.println("Su attaque fue poco eficaz");       
        }else if((a==4)&&(b==2)){
            System.out.println("Su ataque fue poco eficaz");
        }else if ((a==4)&&(b==3)){
            System.out.println("Su ataque fue supereficaz");
        }else if((a==4)&&(b==4)){
            System.out.println("Su ataque fue neutral");
            
            
            
            

            
           
       
            
        }
        
        
    }
}
