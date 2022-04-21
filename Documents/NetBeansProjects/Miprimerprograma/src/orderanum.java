
import java.util.Scanner;

public class orderanum {
    public static void main(String[] args){
        Scanner tc =new Scanner(System.in);
        int nnum,aux,max,i;// variables inutiles b y c
        
        do{
           System.out.print("Ingresa la cantidad de números a introducir: ");
           nnum=tc.nextInt();
        }while (nnum <=0);// le faltaba el ;
                
        max=0;
        i=0;
        //  la variable no es num es nnum y esta mal puesto el while
        while(i<=nnum){
            System.out.print("Introduce el número :" ); // sobran los parentesis y la i hay que eleminarla y poner los : entre ""
            aux= tc.nextInt();
            if(max<aux){
                max = aux;
            }
            i++;
        }
        System.out.println("El número mayor es: "+max);
    }
}
