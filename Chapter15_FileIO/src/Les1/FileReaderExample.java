package Les1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

        FileReader fileReader = null;

        try {
            // Dit object wordt gebruikt om het tekstbestand te lezen
           fileReader = new FileReader("C:\\Users\\intec\\Documents\\test1.txt");
            
            // Er wordt een position-variabele gedefinieerd om de gelezen posities in het bestand bij te houden.
            int position;
            
            // De voorwaarde(position =  fileReader.read()) != 1 controleert of er nog karakter zijn om te lezen.
            //Zolang er karakter zijn, wordt de lus herhaald.
            while (((position = fileReader.read()) != -1)){
                System.out.print((char) position);
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
            System.out.println("Deze bestand bestaat niet");
        }finally {
            //Deze code controleert of de fileReader niet null is en probeert vervolgens de fileReader te sluiten.
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
        }
    }
}
