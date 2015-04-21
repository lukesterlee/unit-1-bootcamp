/**
 * Created by Luke Lee on 4/14/15.
 */
public class Bonus {

    public static long collatz(long number, long count) {

        //System.out.print(number + " -> ");

        if (number == 1 || number == 0) {
            return count;
        } else if (number % 2 == 0) {
            return collatz(number/2, ++count);
        } else {
            return collatz((3 * number) + 1, ++count);
        }

    }



    public static void printCollatz(long number, long count) {

        System.out.print(number + " -> ");

        if (number == 1 || number == 0) {
            return;
        } else if (number % 2 == 0) {
            printCollatz(number / 2, ++count);
        } else {
            printCollatz((3 * number) + 1, ++count);
        }

    }

    public static void coin() {
        int count = 0;
        int[] values = new int[] {1, 2, 5, 10, 20, 50, 100, 200};
        int[] max = new int[] {200, 100, 40, 20, 10, 4, 2, 1};

    }

    public static void main(String[] args) {

        long top = 0;

        for (int i = 2; i <= 3000000; i++) {

            long current = collatz(i, 1);
            if (current > top) {
                //printCollatz(i, 1);
                System.out.println(i);
                //System.out.println();
                top = current;
            }

        }


        System.out.println(top);

    }

}
