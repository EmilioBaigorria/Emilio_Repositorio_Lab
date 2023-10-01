package Introducción;
/* El programa pide que se introduzca un número entero y comprueba si el número es capicúa o no lo es. Si el número introducido no tiene tres cifras se muestra un mensaje indicándolo y el programa finaliza.

        Un número es capicúa si se puede leer igual de izquierda a derecha que de derecha a izquierda. Por ejemplo los números 1221, 35053, 969 ... son capicúa.

        Como el programa pide que el número introducido sea de tres ciftras, para comprobar si es capicúa solo tendremos que comprobar si la primera cifra y la última son iguales.  */



import java.util.Scanner;

public class ej_14 {
    public static void main(String[] args) {

        int num;
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese un número de tres cifras: ");
        num= lector.nextInt();
        if (num>=100 && num<=999){
            if (num%10 == num/100){
                System.out.println("El número SI es capicua");
            }else{
                System.out.println("El número NO es capicua");
            }
        }else{
            System.out.println("Incorrecto, el número no tiene 3 cifras");
        }
    }
}
