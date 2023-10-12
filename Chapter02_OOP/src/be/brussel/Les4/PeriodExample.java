package be.brussel.Les4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        Period tenDays = Period.ofDays(10);
        System.out.println(tenDays.getDays());

        LocalDate oldDate = LocalDate.of(1985, Month.NOVEMBER, 23);
        LocalDate newDate = LocalDate.of(2022, Month.AUGUST,22);

        Period period = Period.between(oldDate,newDate);

        System.out.print(period.getYears()+" years,");
        System.out.print(period.getMonths()+" months,");
        System.out.print(period.getDays()+" days,");
    }
}
