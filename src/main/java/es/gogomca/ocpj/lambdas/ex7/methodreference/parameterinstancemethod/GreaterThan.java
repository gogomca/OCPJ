package es.gogomca.ocpj.lambdas.ex7.methodreference.parameterinstancemethod;

public class GreaterThan {
  private Integer number;

  GreaterThan(Integer number) {
    this.number = number;
  }

  public boolean isGreatherThanTen(Integer anotherNumber) {
    return number > anotherNumber;
  }
}
