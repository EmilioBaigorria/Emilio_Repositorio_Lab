import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Programa Java que lea un número entero N y muestre la tabla de multiplicar de ese número.
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero entero y te voy a mostrar sus tabla");
        num= input.nextInt();
        for (int n=1;n<=num;n++){
            System.out.println("Tabla del "+n);
            for (int p=1;p<=10;p++){
                System.out.println(n+"X"+p+"="+(n*p));
            }
        }

    }
}