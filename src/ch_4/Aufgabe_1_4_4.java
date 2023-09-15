package ch_4;

import java.util.Scanner;

public class Aufgabe_1_4_4 {

    private Scanner scanner = new Scanner(System.in);

    void myMethod(){
        String myInput = scanner.nextLine();

        switch (myInput){
            case "ay":
            case "aye":
            case "ay, ay":
            case "ja":
            case "joo":
                System.out.println("Keep it up!");
                break;
            default:
                System.out.println("Don’t you dare!");
        }
    }


    public static void main (String[] args) {
        new Aufgabe_1_4_4().myMethod();
    }
}
