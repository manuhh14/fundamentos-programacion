package ciclos.cliclofor;

public class SenciaCicloFor {
    public static void main(String[] args) {

        for(int i= 0; i< 5; i++){
            System.out.println("i = ["+i+"]");
        }

        int i=0;
        for(; i< 10; i++){
            System.out.println("posiscion actual i = ["+i+"]");
        }

        for(; ; ){
            if(i>5){
                break;
            }
            System.out.println("posiscion actual i = ["+i+"]");
            i++; //esto es un contador
        }
        System.out.println("fin del ciclo for ");

    }
}
