package project1;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;


public class BookApp {


    public static void main(String[] args) {
        Person person1 = new Person("Colson","Whithead", LocalDate.of(1969,11,6));
        Book book1 = new Book("Underground Railroad", person1,LocalDate.of(2016,1,1), "Classic");
        Person person2 = new Person("Gabriel", "Tallent", LocalDate.of(1987,1,1));
        Book book2 = new Book("My Absolute Darling",person2,LocalDate.of(1987,1,1), "Adventure");
        Person person3 = new Person("Catherine", "Poulain", LocalDate.of(1960,1,1));
        Book book3= new Book("Le grand marin", person3, LocalDate.of(2016,1,1),"Classic");
        Person person4 = new Person("Agatha", "Christie", LocalDate.of(1890,9,15));
        Book book4 = new Book("The Murder of Roger Ackroyd", person4,LocalDate.of(1926, 1,1), "Detective");
        Book book5 = new Book("Murder on the Orient Express", person4, LocalDate.of(1934,1,1), "Detective" );

        Book[] books = {book1, book2, book3, book4, book5};


        System.out.println("The newest book is : \n" + getNewestBook(books).getTitle());
        System.out.println();
        printYoungestWriter(books);
        System.out.println();
        printSortedByTitle(books);
        System.out.println();
        countBooksPerAuthor(books);
        System.out.println();
        printBooksReleasedIn2016(books);
    }

    public static Book getNewestBook(Book[] books){
       return Arrays.stream(books)
               .max(Comparator.comparing(Book::getReleaseDate))
               .map(x -> new Book(x.getTitle(),x.getAuthor(),x.getReleaseDate(), x.getGenre()))
               .get();
    }
    public static void printYoungestWriter(Book[] books){
        System.out.println("The youngest writer is : ");
        Arrays.stream(books)
                .max(Comparator.comparing(x -> x.getAuthor().dateOfBirth))
                .map(y -> y.getAuthor().lastName + " " + y.getAuthor().firstName)
                .ifPresent(System.out::println);
    }

    public static void printSortedByTitle (Book[] books) {
        System.out.println("the array sorted by title");
        Arrays.stream(books)
                .map(b -> b.getTitle())
                .sorted()
                .forEach(System.out::println);
    }
    public static void countBooksPerAuthor(Book[] books){
        Map<String,Long> counting = Arrays.stream(books)
                .map(x -> x.getAuthor().lastName + " " + x.getAuthor().firstName)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        counting.forEach((author, count) ->System.out.print(author + ": " + count + "; "));
        System.out.println();
    }



    public static void printBooksReleasedIn2016(Book[] books){
        System.out.println("Books released in 2016 : ");
        Arrays.stream(books)
                .filter(d -> d.getReleaseDate().getYear()==2016)
                .map(a -> a.getTitle())
                .forEach(System.out::println);
    }


}






