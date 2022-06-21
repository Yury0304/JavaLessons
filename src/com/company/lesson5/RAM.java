package com.company.lesson5;

public class RAM {

    String brand;
    int size;

    RAM() {
        this.brand="Samsung";
        this.size=3;
    }

    public RAM(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    void RAMInfo() {
        System.out.println("RAM brand is " + brand);
        System.out.println("RAM size is " + size+"Gb");
    }

    @Override
    public String toString() {
        return "RAM{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
