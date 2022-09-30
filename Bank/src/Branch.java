import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String name, Double transaction){
        Customer customer = new Customer(name,transaction);
        if(customer != null){
            return true;
        } else {
            return false;
        }
    }
}
