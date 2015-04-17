import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static int calculateSquare(int number) {
        return number*number;
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static String toLowerCase(String text) {
        return text.toLowerCase();
    }

    public static boolean isMultiple(int a, int b) {
        return (a % b == 0);
    }

    public static void prettyInteger(int number) {
        for (int i = 1; i <= number; i++)
            System.out.print("*");
        System.out.print(" " + number + " ");
        for (int i = 1; i <= number; i++)
            System.out.print("*");
    }

    public static int random(int start, int end) {
        Random random = new Random();
        return random.nextInt(end - start) + start;
    }

    public static void main (String args[]) {
    }
}
