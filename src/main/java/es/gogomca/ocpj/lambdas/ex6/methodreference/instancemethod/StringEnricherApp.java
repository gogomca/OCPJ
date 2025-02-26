package es.gogomca.ocpj.lambdas.ex6.methodreference.instancemethod;

public class StringEnricherApp {

  public static void main(String[] args) {
    var stringEnricher = new StringEnricher();

    StringEnrichable text = stringEnricher::enrich;

    System.out.println(text.enrich("^_^"));
  }
}
