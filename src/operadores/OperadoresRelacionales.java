package operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;//cambiar para que despues de true
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j;
        //boolean b1 = 5 == 5;
        //boolean b1 = 5 == 7;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1; ///negacion
        System.out.println("b2 = " + b2);

        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        boolean b4 = m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = m != true;
        System.out.println("b5 = " + b5);

        boolean b6 = i > j;
        System.out.println("b6 = " + b6);

        boolean b7 = i < j;
        System.out.println("b7 = " + b7);

        boolean b8 = l >= k;
        System.out.println("b8 = " + b8);

        boolean b9 = l <= k;
        System.out.println("b9 = " + b9);

        /*operadores logicos*/
        //and
        ///  se deben culplir todas las condiciones deben ser vedaderas para que sea -->true
        boolean b10 = i == j && k < l;
        System.out.println("b10 = " + b10);

        //OR
        //por  lo menos una de las condiciones debe ser verdadera para que de resultadoo --->true
        boolean b11 = i == j || k > l;
        System.out.println("b11 = " + b11);

        boolean b12 = i == j && (k > l || m == false);
        System.out.println("b12 = " + b12);

        /// precedencia de los aperadore logicos
        /// siempre se empieza a evaluar de izquierda a derecha
        /*en este caso esiste una prioridad entre operadores y
         * lo primero que se evalua es el AND y no el OR*/

        boolean b13 = i == j || k < l;
        System.out.println("b13 = " + b13);

        boolean b14 = i == j && (k > l || m == true);
        System.out.println("b14 = " + b14);

        boolean b15 = i == j || (k < l && m == true);
        System.out.println("b15 = " + b15);

        boolean b16 = (true || true) && false;
        System.out.println("b16 = " + b16);

        boolean b17 = true || false && false || false;//verdadero
        System.out.println("b17 = " + b17);

        boolean b18 = ((true || false) && false) || false;//falso
        System.out.println("b18 = " + b18);

    }
}
