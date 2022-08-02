package com.company.lesson8;

import java.util.Arrays;

public class TwoDimVector {
    private final String twoDimVector ="This is two dim vector";

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public TwoDimVector() {
    }

    public TwoDimVector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double TwoDimVectorLength1(double x1, double y1){
                    double TwoDimVectorLength1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
            System.out.println(TwoDimVectorLength1);
            return TwoDimVectorLength1;

    }
    public double TwoDimVectorLength2(double x2, double y2){
                           double TwoDimVectorLength2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
            System.out.println(TwoDimVectorLength2);
            return TwoDimVectorLength2;
            }

   /* static void TwoDimVectorScalarProduct(double... TwoDimVectorLength){
       double degree=60;
        double radian = Math.toRadians(degree);
        double TwoDimVectorScalarProduct=0;
        for (int i = 1; i < TwoDimVectorLength.length; i++) {
            TwoDimVectorScalarProduct= TwoDimVectorLength[i-1]*TwoDimVectorLength[i]*Math.cos(radian);
            System.out.println(TwoDimVectorScalarProduct);
                    }
        //System.out.println(TwoDimVectorScalarProduct);
            }

    static void TwoDimVectorAddition(double... x){
        double TwoDimVectorAdditionX=0;
        double TwoDimVectorAdditionY=0;



    }*/

    static void TwoDimVectorScalarProduct(double TwoDimVectorLength1, double TwoDimVectorLength2){
        double degree=60;
        double radian = Math.toRadians(degree);
                    double TwoDimVectorScalarProduct= TwoDimVectorLength1*TwoDimVectorLength2*Math.cos(radian);
            System.out.println(TwoDimVectorScalarProduct);
            }

    public void TwoDimVectorAddition(double x1, double y1, double x2, double y2) {
        double TwoDimVectorAdditionX = x1+x2;
        double TwoDimVectorAdditionY = y1+y2;
        System.out.println(TwoDimVectorAdditionX+" "+TwoDimVectorAdditionY);
            }

    public void TwoDimVectorSubtraction(double x1, double y1, double x2, double y2) {
        double TwoDimVectorSubtractionX = x1-x2;
        double TwoDimVectorSubtractionY = y1-y2;
        System.out.println(TwoDimVectorSubtractionX+" "+TwoDimVectorSubtractionY);
    }

    static void RandomArray (int N) {
        int [][] RandomArray = new int[N][2];
        int i,j;
        for (i = 0; i < RandomArray.length; i++) {
            System.out.println();
            for (j = 0; j < RandomArray[i].length; j++) {
                    RandomArray[i][j] = ((int)(Math.random() * 9));
                                    System.out.print(RandomArray[i][j] + " ");

            }
        }
    }

    static void TwoDimVectorCompare(double TwoDimVectorLength1, double TwoDimVectorLength2){
                if (TwoDimVectorLength1==TwoDimVectorLength2){
            System.out.println("Vectors are equal");
        } else {
            System.out.println("Vectors are not equal");
        }
    }

    void showTwoDimVectorInfo1(){
        System.out.println(getX1());
        System.out.println(getY1());
        System.out.println(Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)));
        System.out.println(twoDimVector);
    }

    void showTwoDimVectorInfo2(){
        System.out.println(getX2());
        System.out.println(getY2());
        System.out.println(Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)));
        System.out.println(twoDimVector);
    }
}
