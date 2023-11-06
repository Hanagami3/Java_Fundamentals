package be.brussel.Project1.Customer;

public class NullCustomer extends AbstractCustomer{

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
