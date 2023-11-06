package be.brussel.Project1.Customer;

public class NullPatternDemo {

    public static void main(String[] args) {

        final String[] NAMES = {"Abdulrazak", "Deepika", "Haytam", "Nina"};

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Abdulrazak");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Deepika");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Popo");
        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());

        String name = "Deepika";
        for (int i = 0; i < NAMES.length; i++)
            if (NAMES[i].equals(name))
        System.out.println(NAMES[i]);



    }
}
