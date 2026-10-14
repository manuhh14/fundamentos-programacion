package operadores;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
    /// entrada de datos
    String userName= "manuel";
    String password= "123456";

    Scanner scaner = new Scanner(System.in);

    System.out.println("ingresa tu usuario:");
    String u = scaner.next();

    System.out.println("ingresa tu password:");
    String p = scaner.next();

    boolean esAutenticado = false;

    //proceso
        if (userName.equals(u)  && password.equals(p)){
            /// respuesta verdadera
            esAutenticado = true;
            //salida o mostrar resultados
            System.out.println("Bienvenido ");

        }else {
            // respuesta falsa
            //salida o mostrar resultados
            System.out.println("El usuario o la contraseña es incorrecto");
        }


        if (esAutenticado){
            System.out.println("Hola  ".concat(u));
            System.out.println("Hola  "+ u);
        }else {
            System.out.println("Lo siento nececitas autenticacion");
        }
    }
}
