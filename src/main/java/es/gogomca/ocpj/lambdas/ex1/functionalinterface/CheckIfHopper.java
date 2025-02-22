package es.gogomca.ocpj.lambdas.ex1.functionalinterface;

public class CheckIfHopper implements CheckTrait {

  @Override
  public boolean test(Animal animal) {
    return animal.canHop();
  }

}
