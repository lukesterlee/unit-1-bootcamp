/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {


    public static boolean isOdd(int number) {
        return (number % 2 != 0);
    }

    public static void printHelloWorld() {
        System.out.println("Hello, world.");
    }

    public static int greatestCommonFactor(int a, int b) {
        int gcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (i % a == 0 && i % b == 0)
                gcf = i;
        }
        return gcf;
    }

    public static void main (String args[]) {

    }
}
