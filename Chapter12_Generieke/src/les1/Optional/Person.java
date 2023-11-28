package les1.Optional;

import java.util.Optional;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Person getPerson(String name) {
        Person[] people = new Person[]{new Person("Bob"), new Person("Jean"), new Person("tom")};
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equals(name))
                return people[i];
        }
        return null;
    }

    public static Optional<Person> getPersonOptional(String name) {
        Person[] people = new Person[]{new Person("Bob"), new Person("Jean"), new Person("tom")};
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equals(name))
                return Optional.of(people[i]);
        }
        return Optional.empty();
    }

}
