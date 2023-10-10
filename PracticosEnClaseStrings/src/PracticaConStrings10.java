// ej 10 strings
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner reader=new Scanner(System.in);
    String frase, palabraConMasConsonantes="", palabraConMasConsonantesTemp="";
    int contadorDeEspacios=0,contadorDeConsonantes=0, contadorDeConsonantesTemp=0;
    String[] fraseSeparada;
    System.out.println("Ingrese una frase, que termine en punto:");
    frase=reader.nextLine();
    fraseSeparada = frase.split("\\ ");
    
  for(int i=0; i<frase.length(); i++){
          if ("bcdfghjklmnpqrstvwxyz".contains(String.valueOf(frase.charAt(i)))) {
            contadorDeConsonantesTemp++;
          } else {
            if (contadorDeConsonantesTemp > contadorDeConsonantes) {
              contadorDeConsonantes = contadorDeConsonantesTemp;
              contadorDeConsonantesTemp = 0;
            } else {
              contadorDeConsonantesTemp = 0;
            }
          }
        if (frase.charAt(i)==' '){
          palabraConMasConsonantesTemp = fraseSeparada[contadorDeEspacios];
          
          if (contadorDeConsonantesTemp>contadorDeConsonantes){
            palabraConMasConsonantes=palabraConMasConsonantesTemp;
            contadorDeConsonantesTemp=0;
            }
          contadorDeEspacios++;
        }
        
    }
  }
}
