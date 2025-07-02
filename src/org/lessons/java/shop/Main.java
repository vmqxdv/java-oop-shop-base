package org.lessons.java.shop;

public class Main {
  public static void main(String[] args) {

    Product maglietta = new Product("t-shirt", "Maglietta rossa con collo a V", 12.99f, 0.2f);

    System.out.println(maglietta.getFullName());
    System.out.println(maglietta.getPriceBeforeTax());
    System.out.println(maglietta.getPriceAfterTax());

  }
}
