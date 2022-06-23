package com.company.lesson5;

public class ATM {
    private int currentSumATM;
    private int USD20;
    private int USD50;
    private int USD100;

    public ATM(int USD20, int USD50, int USD100) {
        this.USD20 = USD20;
        this.USD50 = USD50;
        this.USD100 = USD100;
        currentSumATM = USD20 * 20 + USD50 * 50 + USD100 * 100;
    }

    int chargeATM(int amount) {
        System.out.println("Charge sum is " + amount);
        int chargeATM = currentSumATM + amount;
        currentSumATM = chargeATM;
        if (amount >= 100) {
            USD100 += (amount - amount % 100) / 100;
        }
        amount = amount % 100;
        if (amount >= 50) {
            USD50 += (amount - amount % 50) / 50;
        }
        amount = amount % 50;
        if (amount >= 20) {
            USD20 += (amount - amount % 20) / 20;
        }
        System.out.println("Current sum in ATM is " + currentSumATM);
        System.out.println();
        return currentSumATM;
    }

    boolean withdrawATM(int amount) {
        if (currentSumATM >= amount) {
            System.out.println("Withdraw sum is " + amount);
            int withdrawATM = currentSumATM - amount;
            currentSumATM = withdrawATM;
            if (amount >= 100) {
                USD100 -= (amount - amount % 100) / 100;
                System.out.println("USD100 = " + (amount - amount % 100) / 100);
            }
            amount = amount % 100;
            if (amount >= 50) {
                USD50 -= (amount - amount % 50) / 50;
                System.out.println("USD50 = " + (amount - amount % 50) / 50);
            }
            amount = amount % 50;
            if (amount >= 20) {
                USD20 -= (amount - amount % 20) / 20;
                System.out.println("USD20 = " + (amount - amount % 20) / 20);
            }
            System.out.println("Current sum in ATM is " + currentSumATM);
            System.out.println();
            return true;
        } else {
            System.out.println("Error. Withdraw sum exceeds total sum in ATM");
            System.out.println();
        }
        return false;
    }

    void showCurrentATMInfo() {
        System.out.println("Total sum in ATM is " + currentSumATM + " USD, including:");
        System.out.println("USD20 = " + USD20);
        System.out.println("USD50 = " + USD50);
        System.out.println("USD100 = " + USD100);
        System.out.println();
    }

}
