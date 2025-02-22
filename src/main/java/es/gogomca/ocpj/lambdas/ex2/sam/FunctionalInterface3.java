package es.gogomca.ocpj.lambdas.ex2.sam;

@FunctionalInterface
public interface FunctionalInterface3 extends FunctionalInterface1 {

  @Override
  default void method() {} // Overridden method from FuncionalInterface1.

  void method2(); // Single abstract method in FunctionalInterface3.
}
