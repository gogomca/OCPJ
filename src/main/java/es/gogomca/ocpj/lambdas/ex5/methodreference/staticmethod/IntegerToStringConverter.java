package es.gogomca.ocpj.lambdas.ex5.methodreference.staticmethod;

public class IntegerToStringConverter {
  public static void main(String[] args) {
    Converter methodRef = String::valueOf;
    Converter lambda = x -> String.valueOf(x);

    // Note how we have to use the SAM in both the method reference and the lambda expression.
    System.out.println(methodRef.convert(100)); // "100"
    System.out.println(lambda.convert(100)); // "100"
  }
}
