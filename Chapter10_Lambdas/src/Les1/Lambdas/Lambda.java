package Les1.Lambdas;

public class Lambda {

    public static void main(String[] args) {


        //lambda expression to implement above
        //functional interface, This interface
        //by default implement absctactFunction()
        LambdaInterface expression = (int x) -> System.out.println(2 * x);

        //This calls above lambda expression and prints 2 times our input
        expression.abstractFunction(5);
        System.out.println();

        //lambda sum
        LambdaSum result = (int x, int y) -> {return x +y;};
        System.out.println(result.sum(10,5));
        System.out.println();

        //Math
        print((a,b) -> a+b, "ADD");
        print((a,b) -> a-b, "SUB");
        print((a,b) -> a*b, "MUL");
        print((a,b) -> a/b, "DIV");
        System.out.println();

        //reverse
        //declare a reference to MyInterface
        //Assign a lambda expression to the reference
        ReverseInterface ref2 = (str) -> {
            String result2 = "";
            for (int i = str.length()-1; i >= 0; i--)
                result2 += str.charAt(i);
            return result2;
        };
        //call the method of the interface
        System.out.println("Lambda reversed = " + ref2.reverse("lambda"));
        System.out.println();

        //lambda1Interface
        Lambda1Interface ref =(x, y)-> {
            System.out.println("hello" + x + y);
            System.out.println("Have a nice day");
        };
        ref.message("World ",'!');

    }

    static void print(Math math, String op){
        switch (op.toUpperCase()){
            case "ADD":
                System.out.println("The sum of a and b is: " + math.operation(40,20));
                break;
            case "SUB":
                System.out.println("The difference of a and b is: " + math.operation(40,20));
                break;
            case "MUL":
                System.out.println("The product of a and b is: " + math.operation(40,20));
                break;
            case "DIV":
                System.out.println("The division of a and b is: " + math.operation(40,20));
                break;
            default:
                throw new AssertionError();
        }
    }
}
