package be.brussel.les1.Project1.Customer;

public class CustomerFactory {

    public static String[] NAMES = {"Abdulrazak", "Deepika", "Haytam", "Nina"};

    public static AbstractCustomer getCustomer (String name){
        AbstractCustomer customer = new RealCustomer(name);
        AbstractCustomer noCustomer = new NullCustomer();
        for (int i = 0; i < CustomerFactory.NAMES.length; i++) {
            if (CustomerFactory.NAMES[i].equals(name))
                return customer;
            else
                return noCustomer;
        }
            return noCustomer;
        }

}
