package be.brussel.les2;

public class JoinExample {

    public static void main(String[] args) {

        String[] strArrayToString = {"Intec", "Brussels", "is", "the", "best!"};

        String itIsNowAString = String.join("",strArrayToString);

        String itISNowAStringWithHyphen = String.join("-", strArrayToString);

        System.out.println(itIsNowAString);
        System.out.println(itISNowAStringWithHyphen);
    }
}
