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

    BiPredicate<String, String> b1 = String::startsWith; // Method reference on parameter.
    System.out.println(b1.test("chicken", "chick")); // true
    BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
    System.out.println(b2.test("chicken", "chick")); // true

    BiPredicate<Integer, Long> isSameNumber1 = Integer::equals;
    // Because the result is true if and only if the argument is not null
    // and is an Integer object that contains the same int value as this object.
    System.out.println(isSameNumber1.test(111, 111l)); // false
    BiPredicate<String, Integer> isSameNumber2 = (x, y) -> Integer.valueOf(x).equals(y);
    System.out.println(isSameNumber2.test("111", 333)); // false

    BiPredicate<String, String> matchesRegex = String::matches;
    // The BiPredicate first parameter is going to be the String where the matches() method is
    // invoked and the BiParameter second parameter is the matches() method parameter.
    System.out.println(matchesRegex.test("123", "\\d{3}"));// true
    System.out.println(matchesRegex.test("12", "\\d{3}"));// false
  }
}
