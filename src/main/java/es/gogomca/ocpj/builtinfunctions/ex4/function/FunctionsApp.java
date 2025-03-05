package es.gogomca.ocpj.builtinfunctions.ex4.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsApp {

  public static void main(String[] args) {
    Function<String, Double> function1 = Double::valueOf;
    var num = function1.apply("123.45");
    System.out.println(num.getClass() + " | " + num); // class java.lang.Double | 123.45

    BiFunction<String, String, Integer> function2 = (x, y) -> {
      return Integer.valueOf(x) + Integer.valueOf(y);
    };
    Integer sum = function2.apply("123", "321");
    System.out.println(sum.getClass() + " | " + sum); // class java.lang.Integer | 444
  }
}
