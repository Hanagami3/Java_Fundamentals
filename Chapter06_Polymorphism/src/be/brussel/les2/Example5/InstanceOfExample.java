package be.brussel.les2.Example5;

public class InstanceOfExample {

    public static void main(String[] args) {

        String name = "Intec Brussel";
        System.out.println("Is name an instance of String: " +(name instanceof String));
        System.out.println("Is name an instance of Object class: " +(name instanceof Object));


        TestInstanceOf object01 = new TestInstanceOf();
        System.out.println("Is Object01 a instance of TestInstanceOf: " + (object01 instanceof TestInstanceOf));
        System.out.println("Is Object01 a instance of DifferentTestClass: " + (object01 instanceof DifferentTestClass));

        DifferentTestClass object02 = new DifferentTestClass();

        System.out.println("Is Object02 a instance of TestInstanceOf: " + (object02 instanceof TestInstanceOf));
        System.out.println("Is Object02 a instance of DifferentTestClass: " + (object02 instanceof DifferentTestClass));

        TestInstanceOf test = null;
        System.out.println("Is test an instance of TestInstanceof: " +(test instanceof TestInstanceOf));

        //method01
    }
}
