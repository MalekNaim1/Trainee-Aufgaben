package ch_4;

import java.util.Scanner;

public class Aufgabe_1_4_2 {

    private Scanner scanner = new Scanner(System.in);

    public void convertToVolumeUnit() {
        System.out.println("Wie viel Flüssigkeit?");
        double volume = scanner.nextDouble();
        if (volume >= 1) {

            System.out.printf("%d Liter\n",(int)volume);
        }else if (volume >= 0.1) {
            System.out.printf("ca. %d cl\n", (int) (volume * 10));
        } else if (volume >= 0.001) {
            System.out.printf("ca. %d ml\n", (int) (volume * 1000));
        } else {
            System.out.println("Das eingegebene Volumen ist zu klein, um konvertiert zu werden.");
        }

    }
    public static void main(String[] args) {

        new Aufgabe_1_4_2().convertToVolumeUnit();

    }

}
