package Les1;

import java.util.stream.Stream;

public class StreamLimit {

    public static void main(String[] args) {
        Stream.of("Jai", "Ahesh", "Vishal", "Naren", "Hemant")
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}
