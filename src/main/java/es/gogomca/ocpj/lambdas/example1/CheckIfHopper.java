package es.gogomca.ocpj.lambdas.example1;

public class CheckIfHopper implements CheckTrait {

  @Override
  public boolean test(Animal animal) {
    return animal.canHop();
  }

}
