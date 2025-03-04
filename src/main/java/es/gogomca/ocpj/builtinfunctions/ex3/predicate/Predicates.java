package es.gogomca.ocpj.builtinfunctions.ex3.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicates {

  public static void main(String[] args) {
    Predicate<Integer> isNegative = x -> x < 0;
    System.out.println(isNegative.test(-3)); // true
    System.out.println(isNegative.test(3)); // false

    Predicate<String> isEmpty = String::isEmpty;
    System.out.println(isEmpty.test("")); // true
    System.out.println(isEmpty.test("_")); // false

    BiPredicate<String, Integer> isSameNumber = (x, y) -> Integer.valueOf(x).equals(y);
    System.out.println(isSameNumber.test("111", 111)); // true
    System.out.println(isSameNumber.test("111", 333)); // false
  }
}
