package condicionales;

import java.util.Scanner;

public class Edad {
    public  static void main(String[] args) {
        //entrada de datos
        final var EDAD_ADULTO = 18;
        System.out.println("Ingresa tu edad: ");
        var edadPesona = Integer
                .parseInt(new Scanner(System.in).next());

        //proceso
        ///validar la edad
        if (edadPesona >= EDAD_ADULTO) {
            System.out.println("La persona: " +edadPesona + " es un adulto");
        }else if(edadPesona < 0){
            System.out.println("La edad ingresada es erronea");
        }else {
            System.out.println("La persona: " +edadPesona+ "es menor de edad");
        }


    }
}
