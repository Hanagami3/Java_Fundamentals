package les1.Optional;

import java.util.Optional;

public class PersonApp {

    public static void main(String[] args) {

        Person person = Person.getPerson("Bob");
        System.out.println(person.getPerson("Pierre"));
        Person person2 = Person.getPerson("Bob");
        System.out.println(person2.getPerson("Bob"));

        Optional<Person> personOptional = Person.getPersonOptional("Jean");
        System.out.println((personOptional.isPresent() ? personOptional.get().getName() : ""));
        Optional<Person> personOptional1 = Person.getPersonOptional("Pierre");
        System.out.println((personOptional1.isPresent() ? personOptional1.get().getName() : ""));
    }
}
