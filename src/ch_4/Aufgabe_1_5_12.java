package ch_4;

public class Aufgabe_1_5_12 {

    public static void main(String[] args) {
        for (int x = 0; x < 9; x++){
            for(int o = 0; o < 9; o++){
                for(int l = 0; l < 9; l++) {
                    for (int t = 0; t<9;t++)  {
                        int num1 = x*100+o*10+l;
                        int num2 = l*100+x*10+x;
                        int result = t*100+l*10+t;

                        if (num1 + num2 == result){
                            System.out.println(num1 +" + "+ num2 +" = "+ result + " is true");
                            if (x != o && x != t && x != l && o != t && o != l && t != l) {
                                System.out.println("Alle Variablen sind ungleich.");
                            }

                        }

                    }
                }
            }
        }
    }
}
