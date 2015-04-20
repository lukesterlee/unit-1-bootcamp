import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void mostFrequentElement(ArrayList<Integer> list) {


    }

    public static void accessCoders() {

        HashMap<String, Integer> pod = new HashMap<String, Integer>();
        pod.put("Joshelyn", 25);
        pod.put("Ray", 22);
        pod.put("Hoshiko Oki", 26);
        pod.put("Anthony McBride", 28);
        pod.put("Vanice Yee", 27);
        pod.put("Luke Lee", 29);

    }

    public static boolean canRentACar(HashMap<String, Integer> pod) {
        for (Integer age : pod.values()) {
            if (age > 25)
                return true;
        }
        return false;
    }

    public static ArrayList<String> wordsWithoutList(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length)
                words.remove(word);
        }
        return words;
    }

    public static int countClumps(ArrayList<Integer> numbers) {
        int count = 0;
        for (int i = 0; i < numbers.size() - 2; i++) {
            if (numbers.get(i) == numbers.get(i+1)) {
            }
        }


        return count;
    }

    public static void sortingSentence(String sentence) {
        sentence = sentence.toLowerCase();
        TreeSet<String> words = new TreeSet<String>();
        Scanner input = new Scanner(sentence);
        while (input.hasNext()) {
            words.add(input.next());
        }

        for (String word : words) {
            System.out.println(word);
        }
    }


    public static void main (String args[]) {

        ArrayList<Cat> cats = new ArrayList<Cat>();

        Cat c1 = new Cat("Mimi");
        Cat c2 = new Cat("NyangNyang");
        Cat c3 = new Cat("Nunu");
        Cat c4 = new Cat("Bobo");
        Cat c5 = new Cat("Homo");

        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        cats.add(c4);
        cats.add(c5);

        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }

        sortingSentence("Hello, this is Luke Lee and I'm hungry.");

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(1);
        list2.add(1);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(2);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(4);

        System.out.println(countClumps(list1));
        System.out.println(countClumps(list2));
        System.out.println(countClumps(list3));

    }
}
