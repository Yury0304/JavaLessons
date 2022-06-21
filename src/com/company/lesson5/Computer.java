package com.company.lesson5;

public class Computer {
    private int price;
    private String model;
   private RAM ram;
   private HDD hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    void ComputerInfoShort() {
        System.out.println("Computer price is " + price);
        System.out.println("Computer model is " + model);
    }

    void ComputerInfoLong() {
        System.out.println("Computer price is " + price);
        System.out.println("Computer model is " + model);
        System.out.println("Computer has " + ram);
        System.out.println("Computer has " + hdd);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
