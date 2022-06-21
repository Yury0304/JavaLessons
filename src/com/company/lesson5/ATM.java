package com.company.lesson5;

public class ATM {
    private int currentSumATM;
    private int USD50;
    private int USD100;
    private int USD200;

    public ATM(int USD50, int USD100, int USD200){
                this.USD50=USD50;
        this.USD100=USD100;
        this.USD200=USD200;
        currentSumATM=USD50*50+USD100*100+USD200*200;
    }

    int chargeATM(int USD50, int USD100, int USD200) {

        int addATM=USD50*50+USD100*100+USD200*200;
        System.out.println("Please, use only 50, 100 or 200 money value");
        if (addATM > 0) {
            System.out.println("Charge sum equals " + addATM);
                    } else {
            System.out.println("Invalid charge sum");
        }
        int chargeATM = currentSumATM + addATM;
        currentSumATM = chargeATM;
        System.out.println("Current sum in ATM is "+ currentSumATM);
                return currentSumATM;


    }

    int withdrawATM(int delATM) {
        System.out.println("Withdraw sum must be multiple of 50 at least");
        if (delATM > 0 && delATM <= currentSumATM && delATM%50==0) {
            System.out.println("Withdraw sum equals " + delATM);
            System.out.println("Your operation is successful");
        } else {
            System.out.println("Invalid withdraw sum");
        }
        int withdrawATM = currentSumATM - delATM;
        currentSumATM = withdrawATM;

        System.out.println("Current sum in ATM is "+ currentSumATM);
                    return currentSumATM;

    }

    void currentATMInfo() {
        System.out.println("Total sum in ATM is " + currentSumATM + " UDS");
        System.out.println("The amount of UDS50 is " + USD50);
        System.out.println("The amount of UDS100 is " + USD100);
        System.out.println("The amount of UDS200 is " + USD200);
    }

}
