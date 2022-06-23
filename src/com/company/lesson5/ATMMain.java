package com.company.lesson5;

public class ATMMain {
    public static void main(String[] args) {
        ATM Atm1 = new ATM(1, 2, 3);
        Atm1.showCurrentATMInfo();
        Atm1.chargeATM(170);
        Atm1.withdrawATM(170);
    }
}
