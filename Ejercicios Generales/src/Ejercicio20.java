
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        //Programa que calcule la cifra mayor de un número y la posición que ocupa. Se considera la posición 1 la de más a la derecha.
        // Si la cifra mayor se repite varias veces en el número se indicará la posición de la que se encuentre más a la izquierda.
        //Por ejemplo, si leemos el número N = 49982
        //el programa mostrará:
        //Cifra mayor: 9 Posición: 4
        Scanner input = new Scanner(System.in);
        int number,ogNumber,temp,pos=0,maxValue=0,maxValuePos=0;
        System.out.println("Ingrese un valor y mostrare cual es la cifra con el valor mas grande");
        number=input.nextInt();
        ogNumber=number;
        while (number!=0){
            temp= number%10;
            pos++;
            if (temp>=maxValue) {
                maxValue=temp;
                maxValuePos=pos;

            }
            number=number/10;

        }
        System.out.println("El valor mas grande fue "+maxValue+" que se encontraba en la poscicion "+maxValuePos);


    }
}