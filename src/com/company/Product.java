package com.company;

public class Product {
    private String number;
    private String name;
    private String price;


    public Product(String number,String name,String price) {
        this.number = number;
        this.name = name;
        this.price = price;

    }
    public Product(String number) {
        this.number = number;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return number != null ? number.equals(product.number) : product.number == null;
    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "\nПродукт=" + " номер:" + number + ", название:" + name + ", цена:" + price ;
    }
}
