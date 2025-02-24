package es.gogomca.ocpj.lambdas.ex6.methodreference.instancemethod;

public class FloatConverterApp {

  public static void main(String[] args) {
    Integer number = 123;

    // We indicate that SAM implementation is going to execute the floatValue() method over the
    // "number" instance (Integer).
    FloatConverter floatConverter = number::floatValue;

    // The method to be invoked is the SAM one, but the lambda expression is executed instead.
    System.out.println(floatConverter.toFloat()); // 123.0
  }
}
