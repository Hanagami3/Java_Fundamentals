package be.brussel.Les4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DurationExample {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime oldDate = LocalDateTime.of(2016, 8, 31, 10 ,20, 55);

        String formatteDate = ldt.format(myFormatter);

        Duration seconds = Duration.ofHours(1);
        System.out.println(seconds.getSeconds()+" seconds");

        Duration duration = Duration.between(oldDate, ldt);
        System.out.println(duration.getSeconds()+" seconds");
    }
}
