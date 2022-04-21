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
public class LeerDatos {
    public static void main(String[]args){//El primer error lo encontramos aquí ya que el [] no esta bien colocado
        Scanner teclado = new Scanner(System.in);
        int numero;
        //El segundo error que se encuentra es que le estas pidiendo al usuario un número entre 1 y 10 pero no tienes ninguna forma de comprobarlo.
        do{
            System.out.println("Introduce un número entero entre 1 y 10, luego pulsa Enter");
            numero= teclado.nextInt();
        }while(numero<0||numero>10);
        //El tecer fallo detectado es el que no esta cerrado el "" y le falta el ; al final.
        System.out.println("El entero que has escrito es el: " +numero);
        //El cuarto fallo es que falta cerrar el Scanner y el quinto es que falta un cierre de llave.
        teclado.close();
    }
}
