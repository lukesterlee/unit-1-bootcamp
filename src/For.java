/**
 * Created by Luke Lee on 4/17/15.
 */
public class For {


    public static double f(double x) {
        return x*x*x;
    }

    public static void main(String[] args) {

        double area = 0;
        for (double i = 0; i <= 2; i += 0.00000001) {
            area += f(i)*0.00000001;
        }

        System.out.println(area);





        // double iteration.
        int i, j;
        for (i = 0, j = 0; i * j < 1000; i++, j += 2) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }


    }
}
