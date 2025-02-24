package es.gogomca.ocpj.lambdas.ex6.methodreference.instancemethod;

public class IntegerComparatorApp {

  public static void main(String[] args) {
    Integer number = 5;
    Integer anotherNumber = 10;

    // We indicate that SAM implementation is going to execute the compareTo(Integer anotherInteger)
    // method over the "number" instance (Integer).
    IntegerComparator integerComparator = number::compareTo;

    // The method to be invoked is the SAM one, but the lambda expression is executed instead. In
    // this case, the method needs to be provided with the number to be compared to.
    System.out.println(integerComparator.compareTo(anotherNumber)); // -1 (number is lower)
  }
}
