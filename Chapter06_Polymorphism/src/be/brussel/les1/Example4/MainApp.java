package be.brussel.les1.Example4;

public class MainApp {

    public static void main(String[] args) {


        Parent parent = new Child();
        parent.name = "Intec.Brussel";

        System.out.println(parent.name);

        parent.method();

        //Child child0 = new Parent();

        Child child = (Child)parent;
        System.out.println(child.name);
        child.method();
    }
}