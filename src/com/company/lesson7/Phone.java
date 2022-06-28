package com.company.lesson7;

public class Phone {

    private String model;
    private String number;
    private int weight;

    public Phone() {
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, String number, int weight) {
        this(model, number);
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    void showPhoneInfo() {
        System.out.println("Phone model " + model);
        System.out.println("Phone number " + number);
        System.out.println("Phone weight " + weight);
        System.out.println();
    }

    void receiveCall(String name) {
        System.out.println(name + " is calling");
        System.out.println();
    }

    public String getNumber() {
        System.out.println("Current phone number " + number);
        return number;
    }

    void receiveCall(String name, String number) {
        System.out.println(name + " is calling" + number);
        System.out.println();
    }

    void sendMessage(String... number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("Send message to number " + number[i]);
        }
    }

}
