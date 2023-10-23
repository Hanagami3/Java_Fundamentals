package be.brussel.les1;

import java.util.Objects;

public class FinalExample {


        final int THRESHOLD = 5;

        static final  double PI = 3.141592653589793;

        final int CAPACITY;

        static final int DAYS_OF_THE_WEEK;

        final int MINIMUM;

    {
        CAPACITY = 25;
    }

    static{
        DAYS_OF_THE_WEEK = 7;
    }

    public FinalExample(){
        MINIMUM = 1;
        System.out.println(MINIMUM);
    }

    public FinalExample(int min){
        this.MINIMUM =  min;
        System.out.println(MINIMUM);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinalExample that = (FinalExample) o;
        return THRESHOLD == that.THRESHOLD && CAPACITY == that.CAPACITY && MINIMUM == that.MINIMUM;
    }

    @Override
    public int hashCode() {
        return Objects.hash(THRESHOLD, CAPACITY, MINIMUM);
    }
}
