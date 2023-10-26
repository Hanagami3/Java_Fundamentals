package be.brussel.les1.Project1.Customer;

public class RealCustomer extends AbstractCustomer{

    public RealCustomer (String name){
        name = AbstractCustomer.name;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean isNil() {
        return false;
    }


}
