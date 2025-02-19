package es.gogomca.ocpj.lambdas.example1;

import java.util.List;

public class FunctionalHoopersFinder {

  public static void main(String[] args) {
    var fish = new Animal("fish", false, true);
    var kangaroo = new Animal("kangaroo", true, false);
    var dog = new Animal("dog", true, true);

    var animals = List.of(fish, kangaroo, dog);

    // Because we are going to provided a lambda expression to check if the animal can hop, the
    // checker is not necessary anymore.
    // var checker = new CheckIfHopper();

    // Now we are providing a lambda expression to check if the animal can hop.
    // The lambda expression: (Animal animal) -> { return animal.canHop(); }
    // This is, something that received an Animal and call the method canHop() on it.
    search(animals, animal -> animal.canHop());

    System.out.println("---------");

    // Without needing a new checker implementation we can check if the animal can swim.
    search(animals, animal -> animal.canSwin());
  }

  private static void search(List<Animal> animals, CheckTrait checker) {
    for (Animal animal : animals) {
      // Using the checker we determine if the animal can hop.
      if (checker.test(animal)) {
        System.out.println(animal.species());
      }
    }
  }

}
