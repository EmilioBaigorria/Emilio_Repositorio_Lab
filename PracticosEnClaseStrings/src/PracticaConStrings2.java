import java.util.Scanner;

public class PracticaConStrings2 {
    public static void main(String[] args) {
        //2 - Dado una secuencia de no nulos, calcular el mayor de los negativos y el promedio de los positivos.
        Scanner input=new Scanner(System.in);

        int num,negative_max=1,positive_total=0,positive_amount=0;
        System.out.println("Ingrese valores enteros, ingrese 0 para dejar de ingresar valores");
        while (true){
            num=input.nextInt();
            if (num>0){
                positive_total=positive_total+num;
                positive_amount++;

            } else if (num<0) {
                if (num<negative_max){
                    negative_max=num;
                }

            }else if (num==0){
                break;

            }
            else {
                System.out.println("Numero no valido, intente denuevo");
            }
        }
        if (positive_amount==0){
            System.out.println("El valor mayor negativo fue " + negative_max + " y no se ingresaron suficientes numero positivos para calcular un promedio");
        }else {
            System.out.println("El valor mayor negativo fue " + negative_max + " y el promedio de los numeros positivos fue " + positive_total / positive_amount);
        }
    }
}