/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {


    public static void print1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void printOneToTen() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void numberPuzzle() {

        for (int i = 0; i <= 60; i++) {
            for (int j = 0; j <= 60; j++) {
                if (i + j == 60 && Math.abs(i-j) == 14)
                    System.out.println("(" + i + ", " + j + ")");
            }
        }

    }

    public static void main (String args[]) {


        numberPuzzle();
        
    }
}
