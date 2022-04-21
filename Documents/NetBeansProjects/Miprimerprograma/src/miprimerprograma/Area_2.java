package miprimerprograma;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jake
 */
public class Area_2 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int ladoMayor, ladoMenor, area, perimetro;
        System.out.println("Programa que calcula el área y el perímetro de un rectángulo.");
        do{
            System.out.println("Introduce el valor del lado mayor");
            ladoMayor = teclado.nextInt();
        }while(ladoMayor < 0);
        do{
            System.out.println("Introduce el valor del lado menor");
            ladoMenor = teclado.nextInt();
        }while(ladoMenor < 0);
        area = ladoMayor+ladoMenor;
        perimetro= (2*ladoMayor)+(2*ladoMenor);
        System.out.println("El área del rectangulo es: " +area);
        System.out.println("El perimetro del rectangulo es:" +perimetro);
        teclado.close();
    }
}
