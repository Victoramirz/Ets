/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerprograma;

import java.util.Scanner;

/**
 *
 * @author Jake
 */
public class Tabla_multiplicar {
    
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int numero,b = 1;
        do{
            System.out.println("Introduce un número entero entre 1 y 10, luego pulsa Enter");
            numero= teclado.nextInt();
            if((numero<0||numero>10)){
                System.out.println("Sólo para las tablas de multiplicar del 1 al 10");
            }
        }while(numero<0||numero>10);
        System.out.println("El entero que has escrito es el: " +numero);
        System.out.println("La tabla de multiplicar de "+ numero +" es:");
        do{
            System.out.println(numero+ "x"+b+ "=" + (numero*b));
            b++;
        }while(b<=10);
        teclado.close();
    }
    
}
