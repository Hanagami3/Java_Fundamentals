package be.brussel.Les5.Oefening7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Oefening3 {

    public static void main(String[] args) {

        LocalDate nu = LocalDate.now();
        LocalDate oudeDatum = LocalDate.of(1992,1,11);

        long years = ChronoUnit.YEARS.between(oudeDatum,nu);
        long months = ChronoUnit.MONTHS.between(oudeDatum,nu);
        long days = ChronoUnit.DAYS.between(oudeDatum,nu);
        System.out.println("Since my birthday: " + years + " years; or " + months + " months; or " + days + " days.");

        Period leeftijd = Period.between(oudeDatum,nu);

        System.out.println("I was born " + leeftijd.getYears() + " years, " + leeftijd.getMonths()+ " months and " + leeftijd.getDays() + " days ago.");
    }
}
