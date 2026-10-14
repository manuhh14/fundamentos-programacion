package ciclos.cliclofor;

public class Ejercicio2 {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Gabi", "Lupita", "Paco", "Lola"};

        int count = nombres.length;
        for (int i= 0; i< count; i++){

            if(nombres[i].equalsIgnoreCase("pepe")
                    || nombres[i].equalsIgnoreCase("gabi")){
                continue;
            }
            System.out.println("nombres ["+i+"] = "+nombres[i]);
        }
    }
}
