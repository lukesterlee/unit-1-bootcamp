/**
 * Access Code
 * Created by alexandraqin on 4/14/15.
 */

import com.stripe.Stripe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class UsingAPIs {

  public static void main (String args[]) throws FileNotFoundException {

      Stripe.apiKey = "sk_test_ri5pdNRsAUVkUv238lCIFTB0";

      File file = new File("/Users/Willee/Desktop/accesscode-forks/unit-1-bootcamp/resources/pg98.txt");
      Scanner input = new Scanner(file);

      HashSet<String> words = new HashSet<String>();



      String word;
      int count = 0;

      while (input.hasNext()) {
          word = input.next();
          word = word.toLowerCase();
          if (!Character.isLetter(word.charAt(0))) {
              word = word.substring(1);
          }
          words.add(word);
          count++;
      }

      System.out.println(count);
      System.out.println(words.size());
      System.out.println();


  }
}
