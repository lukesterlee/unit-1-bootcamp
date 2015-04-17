/**
 * Access Code
 * Created by alexandraqin on 4/14/15.
 */

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.net.RequestOptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class UsingAPIs {

  public static void main (String args[]) throws FileNotFoundException {

      //Stripe.apiKey = "sk_test_ri5pdNRsAUVkUv238lCIFTB0";

      RequestOptions requestOptions = (new RequestOptions.RequestOptionsBuilder()).setApiKey("sk_test_ri5pdNRsAUVkUv238lCIFTB0").build();
      Map<String, Object> chargeMap = new HashMap<String, Object>();
      chargeMap.put("amount", 100);
      chargeMap.put("currency", "usd");
      Map<String, Object> cardMap = new HashMap<String, Object>();
      cardMap.put("number", "4242424242424242");
      cardMap.put("exp_month", 12);
      cardMap.put("exp_year", 2020);
      chargeMap.put("card", cardMap);
      try {
          Charge charge = Charge.create(chargeMap, requestOptions);
          System.out.println(charge);
      } catch (StripeException e) {
          e.printStackTrace();
      }




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
