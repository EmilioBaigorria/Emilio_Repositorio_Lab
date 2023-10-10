import java.util.Scanner;

public class PracticaConStrings3 {
    public static void main(String[] args) {
        //3. Dado una secuencia de no nulos, mostrar el menor de los pares y la cantidad de impares.
        Scanner input=new Scanner(System.in);

        int num,min_even=1000,amount_odd=0;
        System.out.println("Ingrese valores enteros, ingrese 0 para dejar de ingresar valores");
        while (true) {
            num = input.nextInt();
            if (num==0){
                break;

            } else if (num%2==0) {
                if (num<min_even){
                    min_even=num;
                }

            } else {
                amount_odd++;
            }
        }
        System.out.println("El menor valor de los numeros pares fue "+min_even+" y la cantidad de numeros impares ingresados fue "+amount_odd);
    }
}