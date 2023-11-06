package Les1.NonStaticExample;

public class MainApp2 {

    public static void main(String[] args) {

        NonStatic myNonStatics = new NonStatic();
        NonStatic.Inner myNonStaticInner = myNonStatics.new Inner();

        myNonStatics.run();
        myNonStaticInner.run();
    }
}
