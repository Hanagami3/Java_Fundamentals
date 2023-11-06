package Les1.StaticExample;

public class OuterClass1 {


    private int OuterX;
    public  static class InnerClass{

        private int staticInnerX = 5;

        //getter and setters InnerClass


        public int getStaticInnerX() {
            return staticInnerX;
        }

        public void setStaticInnerX(int staticInnerX){
            this.staticInnerX = staticInnerX;
        }
    }

    // getter and setter OuterClass

    public int getOuterX() {
        return OuterX;
    }

    public void setOuterX(int outerX) {
        OuterX = outerX;
    }

}
