package ciclos.cliclofor;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingresa una palabla");
        String palabra = scanner.nextLine().toLowerCase();
        String vocales= "aeiou";

        for(int i=0; i<palabra.length();i++){
            char vacal = vocales.charAt(i);

            //si el caracter de la vocal se encuentra en la palabra
            if (palabra.indexOf(vacal) != -1){
                System.out.println(vacal);
            }
        }
        scanner.close();
    }
}
