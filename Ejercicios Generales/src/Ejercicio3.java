import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //
        //Pasar de grados centígrados a kelvin en Java
        //Programa Java que lee una temperatura expresada en grados centígrados y la convierte a grados kelvin.
        //
        //El proceso de leer grados centígrados se debe repetir mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
        //
        //Para hacer la conversión de grados Centígrados a grados Kelvin hay que utilizar la fórmula:
        //
        //ºK = ºC + 273
        Scanner input=new Scanner(System.in);

        float Kel,Cen;
        int rep=1;
        do {
            System.out.println("Ingrese los grados ºC que desea pasar a ºK");
            Cen=input.nextFloat();
            Kel = Cen + 273;
            System.out.println(Cen+" grados centigrados enquivalen a "+Kel+" grados kelvin");
            System.out.println("¿Desea ingresa otro valor?\n [1].Si\n [2].No");
            rep=input.nextInt();
            if (rep==1){
                rep=1;
            }else {
                rep=2;
            }


        }while (rep==1);





    }
}