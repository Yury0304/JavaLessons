package com.company.lesson5;

public class ATMMain {
    public static void main(String[] args) {
        ATM Atm1 = new ATM(1,2,3);

        Atm1.chargeATM(1,0,0);
        Atm1.withdrawATM(100);
        Atm1.currentATMInfo();
    }
}
