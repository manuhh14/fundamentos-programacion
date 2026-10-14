package operadores;

import java.util.Scanner;

public class OperadoresLogin {
    public static void main(String[] args) {

        String username = "admin";
        String password = "123456";

        /*aqui agregaremos mas usuarios*/

        Scanner scaner  = new Scanner(System.in);

        System.out.println("Introduce el nombre del usuario");
        String u =  scaner.next();

        System.out.println("Ingresa el password del usuario");
        String p = scaner.next();

        boolean esAutenticado = false;

        if (username.equals(u) && password.equals(p)) {
            esAutenticado = true;
        }else {
            System.out.println("Usuario o contraseña incorrecto");
        }


        if (esAutenticado) {
            System.out.println("Bienvenido usuarios " + u + "!" );
            System.out.println("Bienvenido ".concat(u).concat("!") );
        }else {
            System.out.println("Lo siento requiere autenticacion");
        }


    }
}
