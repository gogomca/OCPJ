package es.gogomca.ocpj.lambdas.ex7.methodreference.parameterinstancemethod;

public class GreaterThanTenCheckerApp {

  public static void main(String[] args) {
    var number = new GreaterThanTen(100);

    // We indicate that SAM implementation is going to execute the isGreatherThanTen method over a
    // GreaterThanTen instance (parameter).
    GreaterThanTenChecker checker = GreaterThanTen::isGreatherThanTen;

    // The method to be invoked is the SAM one, but the lambda expression is executed over the
    // parameter instead.
    System.out.println(checker.isGreaterThanTen(number)); // true
  }
}
