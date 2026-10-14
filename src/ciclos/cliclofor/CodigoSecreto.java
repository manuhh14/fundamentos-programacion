package ciclos.cliclofor;

import java.util.Scanner;

public class CodigoSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";

        System.out.println("Ingresa el numero de corrimientos: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i< 5; i++){
            System.out.println("Ingresa el  mensaje a incriptar: ");
            String mensaje = scanner.nextLine();
            StringBuilder encriptado =  new StringBuilder(mensaje);

            for (int j=0 ; j< mensaje.length(); j++){
                char letra = mensaje.charAt(j);
                char characterLower = Character.toLowerCase(letra);

                int indice = alfabeto.indexOf(characterLower);
                if (indice != -1){
                    indice = (indice + numero) % 27;
                    encriptado.append(alfabeto.charAt(indice));
                }else {
                    encriptado.append(letra);
                }
            }

            System.out.println("El mensaje incriptado---" + encriptado.toString());
        }

    }
}
