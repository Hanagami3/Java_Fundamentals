package be.brussel.Les5.Oefening7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Oefening2 {

    public static void main(String[] args) {

        LocalDateTime datum = LocalDateTime.of(2022, 8, 22, 14,54,24);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm:ss");

        String formatDateTime = datum.format(format);
        System.out.println(formatDateTime);


    }
}
