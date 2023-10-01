
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int numeroI,cifra;
        int totalSuma=0;

        do {
            System.out.println("Ingrese un número entero positivo: ");
            numeroI= lector.nextInt();
            if (numeroI<0){
                System.out.println("El número no es positivo");
            }
        }while (numeroI<0);
        while (numeroI!=0){
            cifra= numeroI%10;
            totalSuma=totalSuma+cifra;
            numeroI=numeroI/10;
        }
        System.out.println("La suma de las cifras del número ingresado es: "+totalSuma);
    }
}