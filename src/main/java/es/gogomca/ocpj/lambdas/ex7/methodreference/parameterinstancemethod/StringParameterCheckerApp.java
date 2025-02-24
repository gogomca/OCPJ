package es.gogomca.ocpj.lambdas.ex7.methodreference.parameterinstancemethod;

public class StringParameterCheckerApp {

  public static void main(String[] args) {
    // Although the method references seems to be a static method, it is not.
    // String: public boolean isEmpty()
    //
    // We indicate that SAM implementation is going to execute the isEmpty() method over a String
    // instance (parameter).
    StringParameterChecker methodRef = String::isEmpty;

    // The method to be invoked is the SAM one, but the lambda expression is executed over the
    // parameter instead.
    System.out.println(methodRef.check("Zoo")); // false (parameter is not empty).
  }
}
