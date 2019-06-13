# JavaCalculatorIntelliJIDEA
Java basic programming with OOP concept.

This Java simple calculator.
#Features
1.Addition.
2.Subtraction.
3.Multiplication.
4.Division.

#Source Code

# MainClass.java


        //Java Calculator Example

        //Declare Variable
        char choice = 0;

        //Create Scanner Object
        Scanner mScanner = new Scanner(System.in);

        //Create Calculate Object
        Calculator mCalculator = new Calculator();

        do {
            //User Interface
            System.out.println("(1) Addition");
            System.out.println("(2) Subtraction");
            System.out.println("(3) Multiplication");
            System.out.println("(4) Division");
            System.out.println("(0) Exit");
            System.out.println("Enter Your Choice : ");
            choice = mScanner.next().charAt(0);

            switch (choice)
            {
                case '1':
                    mCalculator.scan();
                    mCalculator.addition();
                    mCalculator.displayResult();
                    break;
                case '2':
                    mCalculator.scan();
                    mCalculator.subtraction();
                    mCalculator.displayResult();
                    break;
                case '3':
                    mCalculator.scan();
                    mCalculator.multiplication();
                    mCalculator.displayResult();
                    break;
                case '4':
                    mCalculator.scan();
                    mCalculator.division();
                    mCalculator.displayResult();
                    break;
                case '5':
                    System.exit(0);
                    break;
                default: System.out.println("Invalid Choice!!!");

            }
        }
        while (choice!=5);


# Calculator.java


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
    }

    public void displayResult()
    {
        System.out.println("Result: "+ mResult);
    }

Thank you.
