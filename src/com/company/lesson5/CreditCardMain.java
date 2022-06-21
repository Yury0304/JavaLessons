package com.company.lesson5;

public class CreditCardMain {
    public static void main(String[] args) {
        CreditCard A1 = new CreditCard(1010, 20);
        CreditCard A2 = new CreditCard(2020, 50);
        CreditCard A3 = new CreditCard(3030, 70);
        A1.charge(10);
        A2.charge(20);
        A3.withdraw(30);
        A1.currentInfo();
        A2.currentInfo();
        A3.currentInfo();
    }
}
