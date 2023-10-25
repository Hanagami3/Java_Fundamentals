package be.brussel.les1;

public interface Vehicle {
    // constant variable -> bad practice
    public static final int doors = 3; // public static final is unnecessary!
    int wheels = 4;
    public abstract void speedUp();
    void braking();
    void
    shiftGearUp();
    void shiftGearDown();
    int getCurrentGear();
}