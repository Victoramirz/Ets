/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerprograma;

/**
 *
 * @author Jake
 */
public class Tabla_multiplicar_enteras {
    public static void main(String[]args){
        int numero=1,b=1;
        do{
            System.out.println("La tabla de multiplicar de "+ numero +" es:");
           do{
            System.out.println(numero+ "x"+b+ "=" + (numero*b));
            b++;
            }while(b<=10);  
            numero++;
            b=1;
        }while(numero<=10);
        
    } 
}
