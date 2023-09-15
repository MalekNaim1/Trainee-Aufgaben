package ch_4;

import java.util.Scanner;

public class Aufgabe_1_5_3{

    static Scanner scanner = new Scanner(System.in);
    public static void sumCalc(){

        int num = 0;
        int sum = 0;
        do{
            System.out.println("Enter number");
            num = scanner.nextInt();
            sum += num;
        }while(num != 0);

        System.out.println("Sum: "+ sum);


    }

    public static void main (String[] args) {

        Aufgabe_1_5_3.sumCalc();
    }

}
