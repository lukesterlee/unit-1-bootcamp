/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static boolean isOdd(int number) {
        return (number % 2 != 0);
    }

    public static boolean isMultipleOfThree(int n) {
        return (n % 3 == 0);
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        return (n % 2 != 0 && n % 3 == 0);
    }

    public static boolean isOddAndIsMultipleOfThree2(int n) {
        return (isOdd(n) && isMultipleOfThree(n));
    }

    public static void fizzMultipleOfThree(int n) {
        if (isMultipleOfThree(n))
            System.out.println("Fizz");
        else
            System.out.println(n);
    }

    public static boolean cigarParty(int numberOfCigars, boolean isWeekend) {
        if (isWeekend)
            return (numberOfCigars >= 40);
        else
            return (numberOfCigars >= 40 && numberOfCigars <= 60);
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday)
            speed -= 5;

        if (speed >= 81)
            return 2;
        else if (speed >= 61)
            return 1;
        else
            return 0;
    }

    // Is there a better way to do it?
    public static String alarmClock(int weekDay, boolean isVacation) {
        if (isVacation) {
            if (weekDay == 0 || weekDay == 6)
                return "off";
            else
                return "10:00";
        }
        else {
            if (weekDay == 0 || weekDay == 6)
                return "10:00";
            else
                return "7:00";
        }

    }

    public static int lotteryTicket(int a, int b, int c) {
        if (a == b && b == c)
            return 20;
        else if (a != b && b != c && c != a)
            return 0;
        else
            return 10;
    }

    // How do I catch the exception?
    // Is there a better way to do it?
    public static int blackjack(int a, int b) {
        if (a <= 0 || b <= 0) {
            System.out.println("Wrong input!");
            return -1;
        }

        if (a > 21 && b > 21)
            return 0;
        else if (a > 21)
            return b;
        else if (b > 21)
            return a;
        else {
            return Math.max(a, b);
        }
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        double average = (a + b + c) / 3.0;
        System.out.println(average);
        return (average == a || average == b || average == c);
    }

    public static void main (String args[]) {

        System.out.println(lotteryTicket(1,2,3));
        System.out.println(lotteryTicket(2,2,3));
        System.out.println(lotteryTicket(3,2,2));
        System.out.println(lotteryTicket(3,3,3));

        System.out.println(evenlySpaced(2,4,6));
        System.out.println(evenlySpaced(3,4,6));

    }
}
