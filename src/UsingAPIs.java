/**
 * Access Code
 * Created by alexandraqin on 4/14/15.
 */

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.net.RequestOptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class UsingAPIs {

  public static void main (String args[]) throws FileNotFoundException, CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {


      Stripe.apiKey = "sk_test_ri5pdNRsAUVkUv238lCIFTB0";

      Map<String, Object> lukeVisa = new HashMap<String, Object>();
      lukeVisa.put("number", "4242424242424242");
      lukeVisa.put("object", "card");
      lukeVisa.put("cvc", 850);
      lukeVisa.put("exp_month", 9);
      lukeVisa.put("exp_year", 2018);
      lukeVisa.put("name", "KI W LEE");

      Map<String, Object> luke = new HashMap<String, Object>();
      luke.put("email", "lukesterlee@gmail.com");
      luke.put("source", lukeVisa);
      luke.put("account_balance", 10000);

      Customer lukester = Customer.create(luke);
      Gson info = lukester;
      System.out.println(lukester);



//      File file = new File("/Users/Willee/Desktop/accesscode-forks/unit-1-bootcamp/resources/pg98.txt");
//      Scanner input = new Scanner(file);
//
//      HashSet<String> words = new HashSet<String>();
//
//
//
//      String word;
//      int count = 0;
//
//      while (input.hasNext()) {
//          word = input.next();
//          word = word.toLowerCase();
//          if (!Character.isLetter(word.charAt(0))) {
//              word = word.substring(1);
//          }
//          words.add(word);
//          count++;
//      }
//
//      System.out.println(count);
//      System.out.println(words.size());
//      System.out.println();


  }
}
