package com.company.lesson5;

public class ComputerMain {
    public static void main(String[] args) {
        RAM RAM4Gb = new RAM("Samsung", 4);
        HDD HDD500Gb = new HDD("Seagate", 500, "inner");
        Computer M2 = new Computer(1000, "Acer", RAM4Gb, HDD500Gb);
        Computer M1 = new Computer(2000, "Asus");
        System.out.println("Computer M1");
        M1.showComputerInfoShort();
        System.out.println("Computer M2");
        M2.showComputerInfoLong();
    }
}
