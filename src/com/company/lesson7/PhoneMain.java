package com.company.lesson7;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Sasung", "2569143", 100);
        Phone phone2 = new Phone("LG", "2093297", 150);
        Phone phone3 = new Phone("Apple", "1985209", 200);
        Phone phone4 = new Phone();
        Phone phone5 = new Phone();
        Phone phone6 = new Phone();
        phone4.setModel("Xiaomi");
        phone4.setNumber("2834520");
        phone4.setWeight(120);
        phone5.setModel("Huawei");
        phone5.setNumber("1670065");
        phone5.setWeight(140);
        phone6.setModel("NOKIA");
        phone6.setNumber("7946702");
        phone6.setWeight(160);
        System.out.println(phone4.getModel());
        System.out.println(phone4.getNumber());
        System.out.println(phone4.getWeight());
        System.out.println(phone5.getModel());
        System.out.println(phone5.getNumber());
        System.out.println(phone5.getWeight());
        System.out.println(phone6.getModel());
        System.out.println(phone6.getNumber());
        System.out.println(phone6.getWeight());
        phone1.showPhoneInfo();
        phone2.showPhoneInfo();
        phone3.showPhoneInfo();
        phone1.receiveCall("Sasha");
        phone2.receiveCall("Pasha");
        phone3.receiveCall("Masha");
        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();
        phone1.sendMessage(phone2.getNumber(), phone3.getNumber(), phone4.getNumber(), phone5.getNumber(), phone6.getNumber());
    }
}
