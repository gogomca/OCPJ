package es.gogomca.ocpj.lambdas.ex7.methodreference.parameterinstancemethod;

public class GreaterThanTen {
  private Integer number;

  GreaterThanTen(Integer number) {
    this.number = number;
  }

  public boolean isGreatherThanTen() {
    return number > 10;
  }
}
