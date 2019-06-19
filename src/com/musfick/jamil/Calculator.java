package com.musfick.jamil;

import java.util.Scanner;

public class Calculator {

    //Declare Variable
    private float mFirstNum;
    private float mSecondNum;
    private float mResult;

    //Create Scanner Object
    Scanner mScanner = new Scanner(System.in);

    public Calculator() {

    }

    public void subtraction()
    {
        mResult = mFirstNum-mSecondNum;
    }

    public void addition()
    {
        mResult = mFirstNum+mSecondNum;
    }

    public void multiplication()
    {
        mResult = mFirstNum*mSecondNum;
    }

    public void division()
    {
        mResult =  mFirstNum/mSecondNum;
    }

    public void scan()
    {
        //First Number Input
        System.out.println("Enter first number: ");
        mFirstNum = mScanner.nextFloat();

        //Second Number Input
        System.out.println("Enter second number: ");
        mSecondNum = mScanner.nextFloat();

        //Try
    }

    public void displayResult()
    {
        System.out.println("Result: "+ mResult);
    }
}
