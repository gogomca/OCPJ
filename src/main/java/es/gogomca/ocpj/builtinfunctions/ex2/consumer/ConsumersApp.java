package es.gogomca.ocpj.builtinfunctions.ex2.consumer;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumersApp {

  public static void main(String[] args) {
    Consumer<Integer> square = x -> System.out.println(x * x);
    square.accept(3); // 9

    BiConsumer<Integer, Integer> multiply = (x, y) -> System.out.println(x * y);
    multiply.accept(2, 4); // 8

    var map = new HashMap<String, Integer>();
    BiConsumer<String, Integer> b1 = map::put; // Method reference on an instance.
    BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
    b1.accept("chicken", 7);
    b2.accept("chick", 1);
    System.out.println(map); // {chicken=7, chick=1}
  }
}
