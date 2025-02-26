package es.gogomca.ocpj.lambdas.ex8.methodreference.constructor;

import java.util.function.Function;

public class StringCopierApp {

  public static void main(String[] args) {
    StringCopier methodRef = String::new;

    var myString = methodRef.copy("Zebra");

    System.out.println(myString.equals("Zebra")); // true

    // ---------------------------------------------------

    Function<String, String> parameterisedConstructor = String::new;

    var otherString = parameterisedConstructor.apply("Leopard");

    System.out.println(otherString.equals("Leopard")); // true
  }
}
