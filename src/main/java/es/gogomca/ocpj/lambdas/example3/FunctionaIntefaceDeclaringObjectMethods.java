package es.gogomca.ocpj.lambdas.example3;

@FunctionalInterface
public interface FunctionaIntefaceDeclaringObjectMethods {
  // Abstract methods with the signature from Object methods.
  @Override
  String toString();

  @Override
  boolean equals(Object o);

  @Override
  int hashCode();

  // Abstract method to be considered from the point of view of SAM rule.
  void method();
}
