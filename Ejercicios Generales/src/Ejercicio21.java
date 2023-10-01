
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        //Programa que calcule la cifra mayor de un número y la posición que ocupa.
        //Se considera la posición 1 la de más a la izquierda. Si la cifra mayor se
        //repite varias veces en el número se indicará la posición de la que se encuentre más a la izquierda.
        //Por ejemplo, si leemos el número N = 75271
        //el programa mostrará:
        //Cifra mayor: 7 Posición: 1
        Scanner input = new Scanner(System.in);
        int number,numberLen=0,ogNumber,temp,pos=0,maxValue=0,maxValuePos=0;
        System.out.println("Ingrese un valor y mostrare cual es la cifra con el valor mas grande");
        number=input.nextInt();
        ogNumber=number;
        while (number!=0){
            numberLen++;
            number=number/10;
        }
        pos=numberLen;
        number=ogNumber;
        while (number!=0){
            temp= number%10;
            pos--;
            if (temp>=maxValue) {

                maxValue=temp;
                maxValuePos=pos+1;

            }
            number=number/10;

        }
        System.out.println("El valor mas grande fue "+maxValue+" que se encontraba en la poscicion "+maxValuePos);


    }
}