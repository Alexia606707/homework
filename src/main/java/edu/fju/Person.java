package edu.fju;

public class Person {
    String id;
    int amount;
    int discount;

    public Person(String id, int amount, int discount) {
        this.id = id;
        this.amount = amount;
        this.discount = discount;
    }

    public void print() {
        System.out.println(id + "\t" + amount + "  " + discount + "  " + (amount-discount));
    }
}
