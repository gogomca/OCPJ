package es.gogomca.ocpj.lambdas.ex5.methodreference.staticmethod.chaining;

import java.util.function.Consumer;
import java.util.function.Function;

public class ChainingConverters {

  public static void main(String[] args) {
    Function<Float, Integer> round = Math::round;

    Function<Integer, String> toString = String::valueOf;

    Consumer<String> print = System.out::println;

    var num = 123.654f;

    print.accept(round.andThen(toString).apply(num));
  }
}
