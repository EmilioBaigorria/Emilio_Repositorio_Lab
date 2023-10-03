import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Programa que muestra los números primos desde 2 hasta N. El valor de N se introduce por teclado.
        Scanner input = new Scanner(System.in);
        int N;
        boolean prime;
        System.out.println("Ingrese un numero entero positivo y mostrare todos los numeoros primos desde 2 hasta el numero ingresado");
        N=input.nextInt();
        for (int p=2;p<=N;p++) {
            prime=true;
            for (int i = 2; i<p; i++) {
                if (p % i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(p+" es primo");
            }

        }
    }

}
