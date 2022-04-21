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
public class Volumen {
    public static void main (String[] args){
        double alto,ancho,largo,volumen;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Introduce el alto de la caja");
            alto = teclado.nextDouble();
        }while(alto<0);
        do{
            System.out.println("Introduce el ancho de la caja");
            ancho = teclado.nextDouble();
        }while(ancho<0);
        do{
            System.out.println("Introduce el largo de la caja");
            largo = teclado.nextDouble();
        }while(largo<0);
        volumen= alto*ancho*largo;
        System.out.println("El volumen de su caja es de: " +volumen);
        teclado.close();
    }
}
