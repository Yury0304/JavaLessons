package com.company.lesson8;

public class VectorMain {
    public static void main(String[] args) {
        TwoDimVector twoDimVector1 = new TwoDimVector(5,10,0,0);
        TwoDimVector twoDimVector2 = new TwoDimVector(0,0,10,15);
        TwoDimVector twoDimVector3 = new TwoDimVector();
        TwoDimVector twoDimVector4 = new TwoDimVector();
        twoDimVector1.TwoDimVectorLength1(5,10);
        twoDimVector2.TwoDimVectorLength2(10,15);
        //System.out.println(twoDimVector1.TwoDimVectorLength(5,10));
       // System.out.println(twoDimVector2.TwoDimVectorLength(10,15));
        TwoDimVector.TwoDimVectorScalarProduct(twoDimVector1.TwoDimVectorLength1(5, 10), twoDimVector1.TwoDimVectorLength2(10,15));
        twoDimVector3.TwoDimVectorAddition(5,10,10,15);
        twoDimVector4.TwoDimVectorSubtraction(5,10,10,15);
        TwoDimVector.RandomArray(4);
        TwoDimVector.TwoDimVectorCompare(twoDimVector1.TwoDimVectorLength1(5, 10), twoDimVector1.TwoDimVectorLength2(10,15));
        twoDimVector1.showTwoDimVectorInfo1();
        twoDimVector2.showTwoDimVectorInfo2();


    }
}
