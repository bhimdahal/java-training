package week2;

public class Operators {
    //objects are created thru constructors

    //variable declartion
    //step1: accessor types: private, public, default (empty)
    //step2: data type: int, float, double, long, String, boolean,
    //step3: variable name
    //step4: initialize (give initial value) =
    private int age = 1000000000;
    private  String name = "Java";
    private float num1 = 12.59f;
    private long bigNumber = 1000000000000l;
    private double num2 = 10009489399349343.454545;
    private boolean isActive = true;

    //default constructor
    public Operators(){}

    //method declartion
    //step1: accessor type
    //step2: return type: int, float, double, long, String, boolean or void
    //step3: method name ()
    public  void saySomething(){
        System.out.println("My name is : " + name);
        System.out.println("My age is: " + age);
    }

    public float addNum(){
        int addNum = 5;
        float add = addNum + num1;
        return add;
    }
    public double substract(){
        int subNum = 10;
        double sub = num2 - subNum;
        return sub;
    }

    public static void main(String[] args) {
        Operators operatorsObject = new Operators();
        operatorsObject.saySomething();
        float addOperation = operatorsObject.addNum();
        System.out.println(addOperation);
        double subtractOperation = operatorsObject.substract();
        System.out.println(subtractOperation);
        operatorsObject.airthMeticOperations();

    }

    public void airthMeticOperations(){
        int i = 5;
        float f = 6.05f;
        double d = 10.05;
        long l = 10000l;
        int a = 10;
        int b = 3;

        float multiply = i * f;
        double divide = d/i;
        double remainder = l % d;
        int remainder2 = a % b;

       System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);
        System.out.println("Remainder: " + remainder);
        System.out.println("Remainder2: " + remainder2);

    }

}


