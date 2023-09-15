package ch_4;

import java.util.Scanner;

public class Aufgabe_1_5_8 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        int input = scanner.nextInt();

        for (int i = 0; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%s ",i);
            }
            System.out.println();
        }
    }
}
