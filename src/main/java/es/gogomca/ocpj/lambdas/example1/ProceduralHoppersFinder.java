package es.gogomca.ocpj.lambdas.example1;

import java.util.List;

public class ProceduralHoppersFinder {

  public static void main(String[] args) {
    var fish = new Animal("fish", false, true);
    var kangaroo = new Animal("kangaroo", true, false);
    var dog = new Animal("dog", true, true);

    var animals = List.of(fish, kangaroo, dog);

    var checker = new CheckIfHopper();

    // Using a checker this method searches animals that can hop.
    search(animals, checker);
  }

  private static void search(List<Animal> animals, CheckTrait checker) {
    for (Animal animal : animals) {
      // Here, as CheckTrait is an Functional Interface, the provided lambda expression is executed
      // instead of the test() method.
      if (checker.test(animal)) {
        System.out.println(animal.species());
      }
    }
  }
}
