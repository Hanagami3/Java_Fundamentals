package Les1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\intec\\Documents\\test2.txt"));
            writer.write("Writing to a file.");
            writer.write("\nHere is our file.");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
