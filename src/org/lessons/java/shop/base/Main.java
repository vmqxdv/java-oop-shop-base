package org.lessons.java.shop.base;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    Product maglietta = new Product("t-shirt", "Maglietta rossa con collo a V", new BigDecimal(12.99),
        new BigDecimal(0.22));

    System.out.println(maglietta.getFullName());
    System.out.println(maglietta.getPriceBeforeTax());
    System.out.println(maglietta.getPriceAfterTax());

  }
}
