
public class Aufgabe_1_5_11 {
    public static void main( String[] args ) {

        int repetitions = 2;

        for (int y=1; y<= repetitions; y++){
            for(int x=1; x<= repetitions; x++){
                System.out.print("><> ");
            }
            for(int x=1; x<= repetitions; x++){
                System.out.print("<>< ");
            }
            System.out.println("");
        }


    }
}