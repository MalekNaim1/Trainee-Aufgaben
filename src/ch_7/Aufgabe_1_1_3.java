package ch_7;


public class Aufgabe_1_1_3 {
    static void printSwappedYZ(String string){
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i) ;
            System.out.print(
                    switch (c) {
                        case 'y' -> 'z';
                        case 'z' -> 'y';
                        case 'Y' -> 'Z';
                        case 'Z' -> 'Y';
                        default -> c;
                    }
            );
        }
    }

    static void printSwappedYZ2(String string){
        for (char c : string.toCharArray()){
            if(c=='y'){
                System.out.print('z');
            }else if (c== 'z') {
                System.out.print('y');
            }else if (c== 'Y') {
                System.out.print('Z');
            }else if (c=='Z') {
                System.out.print('Y');
            }else {
                System.out.print(c);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printSwappedYZ("the sleepz liyard layilz ezed the crayz, diyyz, hayz skz");
        printSwappedYZ2("the sleepz liyard layilz ezed the crayz, diyyz, hayz skz");
    }
}
