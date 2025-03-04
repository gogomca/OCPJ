package es.gogomca.ocpj.builtinfunctions.ex1.supplier;

import java.util.function.Supplier;

public class SuppliersApp {

  public static void main(String[] args) {
    Supplier<String> supplier1 = () -> "Hi!";
    System.out.println(supplier1.get()); // "Hi!"

    Supplier<String> supplier2 = () -> {
      return "Bye!";
    };
    System.out.println(supplier2.get()); // "Bye!"

    // var supplier3 = () -> {return "Hi!";};
    // Compiler error: Lambda expression needs an explicit target-type
  }
}
