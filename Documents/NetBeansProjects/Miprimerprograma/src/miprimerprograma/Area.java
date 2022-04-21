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
public class Area {
    //Los errores que habian en el ejercicio son falto recoger el dato introducido de ladomenor, el segundo problema es que el calculo del perimetro es erroneo ya que el calculo de un rectangulo es (P=2x+2y) y por ultimo falta cerrar el Scanner.
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int ladoMayor, ladoMenor, area, perimetro;
        System.out.println("Programa que calcula el área y el perímetro de un rectángulo.");
        System.out.println("Introduce el valor del lado mayor");
        ladoMayor = teclado.nextInt();
        System.out.println("Introduce el valor del lado menor");
        ladoMenor = teclado.nextInt();
        area = ladoMayor+ladoMenor;
        perimetro= (2*ladoMayor)+(2*ladoMenor);
        System.out.println("El área del rectangulo es: " +area);
        System.out.println("El perimetro del rectangulo es:" +perimetro);
        teclado.close();
    }
}
