package ciclos.cliclofor;

import java.util.Scanner;

public class PromedioSumatoria {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        double sumaPositivos = 0;
        int cantidadPositivos = 0;
        int sumaNegativos = 0;

        for (int i = 0; i< 6; i++){
            System.out.println("Ingresa un numero: ");
            int numero =  scanner.nextInt();
            if (numero > 0){
                sumaPositivos += numero;
                cantidadPositivos++;
            }else{
                sumaNegativos += numero;
            }
        }

        //imprimir los resultados
        System.out.println("La sumatoria de  los negativos es: "+ sumaNegativos);
        if (cantidadPositivos != 0){
            System.out.println("El promedio de  los numeros pocitivos es: "+ (sumaPositivos/cantidadPositivos));
        }else {
            System.out.println("No se agregaron numero positivos todos son negativos");
        }
        scanner.close();
    }
}
