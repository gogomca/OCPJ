package es.gogomca.ocpj.lambdas.ex7.methodreference.parameterinstancemethod;

@FunctionalInterface
public interface GreaterThanChecker {

  boolean isGreaterThan(GreaterThan number, Integer anotherNumber);
}
