package es.gogomca.ocpj.lambdas.ex7.methodreference.parameterinstancemethod;

public class GreaterThanCheckerApp {

  public static void main(String[] args) {
    var number = new GreaterThan(100);
    var anotherNumber = 1000;

    // We indicate that SAM implementation is going to execute the isGreatherThan method over a
    // GreaterThan instance (parameter).
    GreaterThanChecker checker = GreaterThan::isGreatherThanTen;

    // The method to be invoked is the SAM one, but the lambda expression is executed over the
    // parameter instead. And the invocation is going to use the anotherNumber parameter.
    System.out.println(checker.isGreaterThan(number, anotherNumber)); // false
  }
}
