package Les1;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterExample {

    public static void main(String[] args) {

        FileWriter fileWriter = null;

        try {
            //Path is een klass die wordt gebruikt om bestands- en maplocaties te representeren en ermee te werken.
            //De methode Path.of() wordt gebruiken om een tekenreeks (in dit geval de bestendslocatie) om te zetten naar een P
            Path path = Path.of("C:\\Users\\intec\\Documents\\test1.txt");

            // De files.createDirectories()-methode wordt gebruiken om een pad te nemen en ervoor te zorgen dat alle mappen in dat pad bestaan.
            Files.createDirectories(path.getParent());

            //Deze code maakt een FileWriter-object aan met de opgegeven bestandslocatie.
            fileWriter = new FileWriter(path.toString());// path.toString() wordt gebruiken om de bestandslocatie als een teken
            fileWriter.write("Hi\n");
            fileWriter.write("Hallo\n");
            fileWriter.write("Bonjour\n");

        }catch (IOException ioException){
            ioException.printStackTrace();

        }finally {
            if (fileWriter != null){
                try {
                    fileWriter.close();
                }catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
        }
    }
}
