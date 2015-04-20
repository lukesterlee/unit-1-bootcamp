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

    public static int sumNumbers(String text) {
        int result;
        String number;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                for (int j = i; j < text.length(); j++) {
                    while (Character.isDigit(text.charAt(j))) {
                        //number +=
                    }
                }


            }
        }

        return 0;
    }

    public static String wordEnds(String text, String word) {
        String result = "";
        int index;
        while (text.contains(word)) {
            index = text.indexOf(word);
            if (index-1 != -1)
                result += text.charAt(index-1) + "";

            if (index+2 != text.length())
                result += text.charAt(index+2) + "";

            text = text.replaceFirst(word, "");
        }
        return result;
    }

    public static void digits() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++)
                System.out.println(i + "" + j + ", " + i + "+" + j + " = " + (i + j));
        }
    }

    public static void main (String args[]) {


        //numberPuzzle();
        //digits();
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }
}
