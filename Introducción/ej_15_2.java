package Introducción;
import java.io.IOException;
import java.util.Scanner;
public class ej_15_2 {
    public static void main(String[] args) throws IOException {
        //15.7
        float num1, num2;
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingresa el dividendo");
        num1=lector.nextFloat();
        System.out.println("Ingresa el divisor");
        num2=lector.nextFloat();
        if (num2==0){
            System.out.println("No se puede dividir por 0 tontin");
        }
        else {
            System.out.println("El resultado de la division entre "+num1+" y "+num2+" es: "+(num1/num2));
        }

    }
}
