import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Leer por teclado un número entero N no negativo y mostrar la suma de los
        // factoriales de todos los números desde 0 hasta N.

        Scanner input = new Scanner(System.in);
        int num;
        double number_total,total_factorial=0;
        System.out.println("Ingrese un numero positivo y entero, mostrare los factoriales de los numeros desde el 0 hasta el numero ingresado");
        num=input.nextInt();
        for (int p=0;p<=num;p++) {
            number_total=1;
            if (p==0){
                number_total=number_total*1;
            }else {
                for (int i = 1; i <= p ; i++) {
                    number_total = number_total * i;
                }
                System.out.println(number_total);

                total_factorial=total_factorial+number_total;
            }
        }
        System.out.println("La suma de los factoriales desde 0 hasta "+num+" es: "+total_factorial);


    }
}