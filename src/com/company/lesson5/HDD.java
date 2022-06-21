package com.company.lesson5;

public class HDD {
    String brand;
    int size;
    String type;

    HDD() {
        this.brand="Seagate";
        this.size = 500;
        this.type = "Inner";
    }

    public HDD(String brand, int size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    void HDDInfo() {
        System.out.println("HDD brand is " + brand);
        System.out.println("HDD size is " + size+"Gb");
        System.out.println("HDD type is " + type);
    }

    @Override
    public String toString() {
        return "HDD{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
