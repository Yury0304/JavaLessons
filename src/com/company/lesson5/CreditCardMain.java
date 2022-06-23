package com.company.lesson5;

public class CreditCardMain {
    public static void main(String[] args) {
        CreditCard A1 = new CreditCard("1111 1111 1111 1111", 20);
        CreditCard A2 = new CreditCard("2222 2222 2222 2222", 50);
        CreditCard A3 = new CreditCard("3333 3333 3333 3333", 70);
        A1.charge(10);
        A2.charge(20);
        A3.withdraw(30);
        A1.showCurrentInfo();
        A2.showCurrentInfo();
        A3.showCurrentInfo();
    }
}
