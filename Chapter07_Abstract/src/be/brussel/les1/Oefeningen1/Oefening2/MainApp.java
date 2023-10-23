package be.brussel.les1.Oefeningen1.Oefening2;

public class MainApp {

    public static void main(String[] args) {

        Oak oak = new Oak();
        oak.aMethod();
        oak.bMethod();

        System.out.println();
        Tree tree = new Oak();
        tree.aMethod();
        tree.bMethod();

        System.out.println();
        Tree tree1 = new Tree() {
            @Override
            public void aMethod() {
                System.out.println("This is abstract method");
            }
        };
        tree1.aMethod();
        tree1.bMethod();


    }
}
