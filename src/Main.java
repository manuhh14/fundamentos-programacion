import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //entrada de datos
        int salud = 100, danoRecibido=35;
        //precedimiento
       // salud -= danoRecibido;
        salud = salud - danoRecibido;
        //impresion de datos
        System.out.println("La salud del pesonaje despues del daño recibido es: " + salud);
    }
}