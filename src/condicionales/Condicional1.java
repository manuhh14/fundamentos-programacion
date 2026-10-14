package condicionales;

import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args) {

        ///entrada de datos
        System.out.println("Ingresa un numero: ");
        ///int numero = -10;
        var numero = Integer.parseInt(new Scanner(System.in).next());

        if (numero > 0){
            /// respuesta verdadera
            System.out.println("El numero es positivo "+numero);
        }else if(numero < 0){
            //respuesta verdadera
            System.out.println("El numero es negativo "+numero);
        }else {
            System.out.println("El valor es 0 "+numero);
        }
    }
}
