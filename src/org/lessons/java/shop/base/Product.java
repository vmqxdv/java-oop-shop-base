package org.lessons.java.shop.base;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

  public int code;
  public String name;
  public String description;
  public BigDecimal price;
  public BigDecimal iva;

  public Product(String name, String description, BigDecimal price, BigDecimal iva) {

    Random random = new Random();

    this.code = random.nextInt(999999);
    this.name = name;
    this.description = description;
    this.price = price;
    this.iva = iva;
  }

  public BigDecimal getPriceBeforeTax() {
    return this.price;
  }

  public BigDecimal getPriceAfterTax() {
    if (price != null && iva != null)
      return price.add(price.multiply(iva)).setScale(2, RoundingMode.DOWN);

    return null;
  }

  public String getFullName() {
    if (name != null)
      return this.code + "-" + this.name;

    return null;
  }

}
