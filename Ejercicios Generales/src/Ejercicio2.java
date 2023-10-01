import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Programa Java que pide un número entero por teclado y calcula y muestra el número de cifras que tiene.
        Scanner input=new Scanner(System.in);
        int num=1,counter=0;
        char numChar;
        System.out.println("Ingrese un numero entero");
        num=input.nextInt();
        while (num!=0){
            num=num/10;
            counter=counter+1;
        }
        System.out.println("La cantidad de cifras que tiene el numero ingresado es de: "+(counter));




    }
}