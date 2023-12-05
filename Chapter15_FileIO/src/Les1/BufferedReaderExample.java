package Les1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\intec\\Documents\\test2.txt"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
