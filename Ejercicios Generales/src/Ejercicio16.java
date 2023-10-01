import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        //   Programa que lea un número entero positivo N e indique si es primo.
        //  Un número es primo si solo es divisible por 1 y por él mismo.
        Scanner input=new Scanner(System.in);
        int prime,isPrime=1;
        System.out.println("Ingrese un numero entero positivo y juzagare si es primo");
        prime=input.nextInt();
        for (int i=2;i<prime;i++){
            if (prime%i==0){
                isPrime=0;
            }
        }
        if (isPrime==1){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
    }
}