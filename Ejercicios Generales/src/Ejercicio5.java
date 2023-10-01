import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Programa que lea una serie de números por
        // teclado hasta que se lea un número negativo.
        // El programa indicará cuántos números acabados en 2 se han leído.
        Scanner input=new Scanner(System.in);
        int rep=1, num,counter=0;

        do {
            System.out.println("Ingresa un numero entero, para salir ingrese un numero negativo");
            num=input.nextInt();
            if (num<0){
                break;
            } else if (num%10==2) {
                counter++;
            }

        }while (true);
        System.out.println("La cantidad de numeros ingresados acabados en 2 es de: "+counter);
    }
}