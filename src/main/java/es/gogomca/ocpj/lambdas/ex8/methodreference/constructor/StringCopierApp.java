package es.gogomca.ocpj.lambdas.ex8.methodreference.constructor;

import java.util.function.Function;

public class StringCopierApp {

  public static void main(String[] args) {
    // In accord with the SAM it is something what expect a String and return a String.
    // String: public String(String original)
    StringCopier methodRef = String::new;

    var myString = methodRef.copy("Zebra");

    System.out.println(myString.equals("Zebra")); // true

    // ---------------------------------------------------

    // In this case we are using another approach to use the constructor method reference.
    Function<String, String> parameterisedConstructor = String::new;

    var otherString = parameterisedConstructor.apply("Leopard");

    System.out.println(otherString.equals("Leopard")); // true
  }
}
