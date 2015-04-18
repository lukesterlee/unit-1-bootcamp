/**
 * Created by Luke Lee on 4/18/15.
 */
public class Benchmark {

    public static void main(String[] args) {

        long startTime =  System.currentTimeMillis();
        long endTime = startTime + 5000; // 1000 is 1 second.
        long count = 0;

        // make it while condition and do-while loop.
        long now = 0;
        do {
            double x = Math.sqrt(count);
            double y = Math.atan2(count, x);

            now = System.currentTimeMillis();


            count++;
        } while (now < endTime);

        System.out.println(count + " loops in 10 seconds.");
    }
}
