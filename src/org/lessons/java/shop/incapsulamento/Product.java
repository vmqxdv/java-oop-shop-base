package org.lessons.java.shop.incapsulamento;

import java.math.BigDecimal;
import java.util.Random;
import java.math.RoundingMode;

public class Product {

  private int code;
  private String name;
  private String brand;
  private BigDecimal price;
  private BigDecimal iva;

  public Product() {

    this.code = 0;
    this.name = "";
    this.brand = "";
    this.price = new BigDecimal(0);
    this.iva = new BigDecimal(0);

  }

  public Product(String name, String brand, BigDecimal price, BigDecimal iva) {

    Random random = new Random();

    this.code = random.nextInt(999999);
    this.name = name;
    this.brand = brand;
    this.price = price;
    this.iva = iva;
  }

  // Code
  public int getCode() {
    return this.code;
  }

  // Name
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Brand
  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  // Price
  public BigDecimal getPrice() {
    return this.price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  // Iva
  public BigDecimal getIva() {
    return this.iva;
  }

  public void setIva(BigDecimal iva) {
    this.iva = iva;
  }

  // Additional
  public String getFullName() {
    if (name != null)
      return this.code + "-" + this.name;

    return null;
  }

  public BigDecimal getPriceAfterTax() {
    if (price != null && iva != null)
      return price.add(price.multiply(iva)).setScale(2, RoundingMode.DOWN);

    return null;
  }

}