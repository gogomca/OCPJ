package es.gogomca.ocpj.builtinfunctions.ex5.unaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorsApp {

  public static void main(String[] args) {
    UnaryOperator<String> unaryOperator = String::toUpperCase;
    System.out.println(unaryOperator.apply("abc")); // ABC

    BinaryOperator<Integer> binaryOperator = Integer::remainderUnsigned;
    System.out.println(binaryOperator.apply(13, 4)); // 1
  }
}
