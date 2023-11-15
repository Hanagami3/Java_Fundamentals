package Streams;

import java.util.Arrays;
import java.util.List;

public class MainApp1 {

    public static void main(String[] args) {

        Opdracht1 opdracht1 = new Opdracht1();
        List<String> staden = Arrays.asList("Auriac", "Abudja", "Tokyo", "Accra", "Abc", "Los Angeles", "Istanbul");

        System.out.println(opdracht1.toUpperCase(staden));
        System.out.println(opdracht1.filterA(staden));
        System.out.println(opdracht1.filterB(staden));
        System.out.println(opdracht1.filterC(staden));
        System.out.println(opdracht1.filterD(staden));
        System.out.println(opdracht1.filterE(staden));
        System.out.println(opdracht1.filterF(staden));
        System.out.println(opdracht1.filterG(staden));
        System.out.println(opdracht1.filterH(staden));
        System.out.println(opdracht1.filterI(staden));
    }
}
