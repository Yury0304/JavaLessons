package com.company.lesson5;

public class RAM {

    private String brand;
    private int size;

    RAM() {
        this.brand = "Samsung";
        this.size = 3;
    }

    public RAM(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    void showRAMInfo() {
        System.out.println("RAM brand is " + brand);
        System.out.println("RAM size is " + size + "Gb");
        System.out.println();
    }

    @Override
    public String toString() {
        return "RAM{" +
                "brand '" + brand + '\'' +
                ", size " + size +
                '}';
    }
}
