package ciclos.cliclofor;

public class Ejemplo1 {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Gabi", "Lupita", "Paco", "Lola"};

        int count =  nombres.length;
        for(int i = 0; i < count; i++){

            //esta parte es para despues de la primera demostracion
            if (nombres[i].equalsIgnoreCase("Andres") || nombres[i].equalsIgnoreCase("Pepe")){
                continue;
            }
            System.out.println(i+ ".- "+nombres[i]);
        }
    }
}
