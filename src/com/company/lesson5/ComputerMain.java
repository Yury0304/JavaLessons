package com.company.lesson5;

public class ComputerMain {
    public static void main(String[] args) {
        RAM ram4Gb = new RAM("Samsung", 4);
        HDD hdd500Gb = new HDD("Seagate", 500, "inner");
        Computer M2 = new Computer(1000, "Acer", ram4Gb, hdd500Gb);
        Computer M1 = new Computer(2000, "Asus");
        System.out.println("Computer M1");
        M1.ComputerInfoShort();
        System.out.println("Computer M2");
        M2.ComputerInfoLong();
    }
}
