/**
 * Created by Luke Lee on 4/15/15.
 */

import java.util.LinkedList;
public class Practice {


    public static void print(LinkedList walker) {
        if (walker == null) {
            return;
        }

        print(walker.next);
        System.out.println(walker.data);
    }



    public static void main(String[] args) {

        // print a singly linked list in reverse recursively.

    }
}
