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
