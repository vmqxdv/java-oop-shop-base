package org.lessons.java.shop;

import java.util.Random;

public class Product {

  int code;
  String name;
  String description;
  float price;
  float iva;

  public Product(String name, String description, float price, float iva) {

    Random random = new Random();

    this.code = random.nextInt(999999);
    this.name = name;
    this.description = description;
    this.price = price;
    this.iva = iva;
  }

  public float getPriceBeforeTax() {
    return this.price;
  }

  public float getPriceAfterTax() {
    return (this.price * this.iva);
  }

  public String getFullName() {
    return this.name + "-" + this.code;
  }

}
