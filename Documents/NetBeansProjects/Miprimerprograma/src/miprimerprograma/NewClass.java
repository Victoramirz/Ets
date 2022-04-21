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
public class NewClass {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int factorial=1;
        System.out.println("Introduce un número");
        int n = teclado.nextInt();
        while(n!=0){
            factorial*=n;
            n--;
        }
        System.out.println("El factorial de " +n+" es "+ factorial);
        teclado.close();
    }
}
