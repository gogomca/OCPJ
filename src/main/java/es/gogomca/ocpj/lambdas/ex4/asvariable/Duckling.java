package es.gogomca.ocpj.lambdas.ex4.asvariable;

public class Duckling {
  public static void makeSound(String sound) {
    // The SAM is defined to receive a String and without any return.
    // void speak(String sound);
    // The lambda expression matches with that definition.
    LearnToSpeak learner = s -> System.out.println(s);

    // Now we can use the variable wherever we want (and it is accepted).
    DucklingHelper.teacher(sound, learner);
  }
}
