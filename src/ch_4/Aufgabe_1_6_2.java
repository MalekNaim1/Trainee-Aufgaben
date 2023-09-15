package ch_4;

public class Aufgabe_1_6_2 {


    public static void line (int len) {

        line("", len, '-', "");
    }

    public static void line (int len, char c) {

        line("", len, c, "");
    }

    public static void line (String prefix, int len, char c, String suffix) {
        System.out.println(prefix + String.valueOf(c).repeat(len) + suffix);
    }


    public static void main (String[] args) {
        Aufgabe_1_6_2.line(24);
        Aufgabe_1_6_2.line(5, '+');
        Aufgabe_1_6_2.line("Ibn ", 6, '*', " al kelb");


    }

}
