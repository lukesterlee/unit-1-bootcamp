/**
 * Created by Luke Lee on 4/14/15.
 */
public class Bonus {

    public static void collatz(long number, long count) {

        System.out.print(number + " -> ");

        if (number == 1 || number == 0) {
            System.out.print("Total : " + count);
            return;
        } else if (number % 2 == 0) {
            collatz(number/2, ++count);
        } else {
            collatz((3 * number) + 1, ++count);
        }

    }

    public static void main(String[] args) {


        collatz(345675, 1);


    }

}
