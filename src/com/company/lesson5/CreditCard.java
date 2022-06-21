package com.company.lesson5;

public class CreditCard {
    private int billNumber;
    private int currentSum;

    public CreditCard(int billNumber, int currentSum) {
        this.billNumber = billNumber;
        this.currentSum = currentSum;
    }

    int charge(int add) {
        if (add > 0) {
            System.out.println("Charge sum equals " + add);
        } else {
            System.out.println("Invalid charge sum");
        }
        int charge = currentSum + add;
        currentSum = charge;
        return currentSum;
    }

    int withdraw(int del) {
        if (del > 0 && del <= currentSum) {
            System.out.println("Withdraw sum equals " + del);
        } else {
            System.out.println("Invalid withdraw sum");
        }
        int withdraw = currentSum - del;
        currentSum = withdraw;
        return currentSum;
    }

    void currentInfo() {
        System.out.println("Current sum of your credit card is " + currentSum);
        System.out.println("Bill number of your credit card is " + billNumber);
    }
}
