package ch_4;

public class Aufgabe_1_5_4 {
    public static void main (String[] args) {
        double t = Math.random() * 10;
        System.out.println(t);
        while(t>0){
            if(t<1){
                t*=2;
            }else{
                t-=1;
            }
            System.out.println(t);
        }



    }

}
