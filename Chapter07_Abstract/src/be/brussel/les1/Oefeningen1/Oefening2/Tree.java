package be.brussel.les1.Oefeningen1.Oefening2;

abstract class Tree {

    public Tree(){
        System.out.println("This is constructor of abstract class");
    }

    public abstract void aMethod();

    public void bMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}
