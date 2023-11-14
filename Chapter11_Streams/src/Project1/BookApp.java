package Project1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookApp {


    public static void main(String[] args) {
        Person person1 = new Person("Virginia","Woolf", LocalDate.of(1882,01,25));
        Book book1 = new Book("Mrs Dalloway", person1,LocalDate.of(1925,01,01), "Classic");
        Person person2 = new Person("J.R.R.", "Tolkien", LocalDate.of(1892,01,03));
        Book book2 = new Book("The Lord of the Rings",person2,LocalDate.of(1954,01,01), "Heroic Fantasy");
        Person person3 = new Person("Francis Scott", "Fitzgerald", LocalDate.of(1896,9,24));
        Book book3= new Book("The Great Gatsby", person3, LocalDate.of(1925,01,01),"Classic");
        Person person4 = new Person("Lewis", "Carroll", LocalDate.of(1832,01,27));
        Book book4 = new Book("Alice in Wonderland", person4,LocalDate.of(1869, 01,01), "Fantasy");
        Person person5 = new Person("Agatha", "Christie", LocalDate.of(1890,9,15));
        Book book5 = new Book("Murder on the Orient Express", person5, LocalDate.of(1934,01,01), "Detective" );

        Book[] books = {book1, book2, book3, book4, book5,};

        printSortedByTitle(books);
    }

    //public static Book getNewestBook(List<Book> books){
      //  return books.stream().filter(x -> x.g).toList();
    //}

    public static void printYoungestWriter(Book[] books){

    }

    public static void printSortedByTitle (Book[] books){
        Arrays.stream(books)
                .sorted(Comparator.comparing(Book::getTitle))
                .toString();


    //public static void countBooksPerAuthor(Book[] books){

    }

    //public static void printBooksReleasedln2016(Book[] books){

    }



