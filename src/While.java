import java.util.Scanner;

/**
 * Created by Luke Lee on 4/17/15.
 */
public class While {

    public static void main(String[] args) {

        // do while loop example.
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a number (press 0 to exit");
            data = input.nextInt();
            sum += data;
        } while (data != 0);

        System.out.println(sum);
    }
}
