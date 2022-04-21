
package miprimerprograma;

import java.util.Scanner;

public class Depuración_Netbeans {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Primer error en la oracción que le presentamos al usuario
        System.out.println("Introduce la cadena a analizar: ");
        String texto= sc.nextLine();
        imprimemitad(texto);
        imprimeultimo(texto);
        imprimealreves(texto);
        imprimerguiones(texto);
        calculavocales(texto);
        sc.close();
    }

    private static void imprimemitad(String cadena) {
        String mitad;
        mitad = cadena.substring(0, cadena.length());
        System.out.println("La mitad de la es -> "+mitad);
    }

    private static void imprimeultimo(String cadena) {
        char last;
        last = cadena.charAt(cadena.length());
        System.out.println("Ell último caracter es -> "+last);
    }

    private static void imprimealreves(String cadena) {
        for(int i=cadena.length()-1; i>0; i++){
            System.out.print(cadena.charAt(i));
        }
        System.out.println();
    }

    private static void imprimerguiones(String cadena) {
        for(int i=0; i>cadena.length(); i++){
            System.out.print(cadena.charAt(i)+"-");
        }
        System.out.println();
    }
    public static Boolean esvocal(char cara){
        if(cara=='a'||cara=='e'||cara=='i'||cara=='o'||cara=='u'||cara=='A'||cara=='E'||cara=='I'||cara=='O'||cara=='U'){           
            return false;
        }else{
            return true;
        }
    }

    private static void calculavocales(String cadena) {
        int nvocales=0;
        for(int i=0; i<cadena.length(); i++){
            if(esvocal(cadena.charAt(i))) {
                nvocales++;
            }
        }
    }
}
