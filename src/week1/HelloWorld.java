package week1;

public class HelloWorld {

    //default constructor
    public HelloWorld(){

    }

    public static void main(String[] args) {
        System.out.println("first program!");
        String methodCalled = sayHello();
        System.out.println(methodCalled);

        HelloWorld helloWorldObject = new HelloWorld();

        helloWorldObject.sayHelloAgain();
        int addOperation = helloWorldObject.add();
        System.out.println(addOperation);
        System.out.println(args[0]);


    }

    public static String sayHello(){
        //logic
        //logic
        return "hello world! whatsup?";
    }

    public void sayHelloAgain(){
        //logic
        //logic
        System.out.println("hi hi!");
    }
    public int add(){
        return 1000000000;
    }
    public long add(int a){
        return 1000000000000l;
    }

    public char getChar(){
        return 'a';
    }

    public float getFloat(){
        return 1.0f;
    }
    public double getDouble(){
        return 20000.0003;
    }
    public String saySomething(){
        String sayHello = "hello";
        String sayWorld = "world!";
        String finalWorld = sayHello + sayWorld;
        return finalWorld;
    }
    public boolean isOn(){
        return true;
    }

    public double substract(){
        return 2 - 1;
    }
    private String privateMethod(){
        return "this is private method!";
    }

}



