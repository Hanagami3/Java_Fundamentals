package Les1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionsExample {

    public static void main(String[] args) {


        String a = "C:\\Users\\intec\\Desktop\\tekstdocument.txt";
        try {
            FileInputStream fis = new FileInputStream(a);
            System.out.println("je hebt deze bestand");
        } catch (FileNotFoundException exception){
            System.out.println("Deze file bestaat niet");
        }

    }
}
