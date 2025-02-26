package es.gogomca.ocpj.lambdas.ex5.methodreference.staticmethod;

public class StringEnricherApp {

  public static void main(String[] args) {
    StringEnrichable text = StringEnricher::enrich;

    System.out.println(text.enrich("^_^"));
  }
}
