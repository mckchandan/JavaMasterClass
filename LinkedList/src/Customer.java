public class Customer {
    private String Name;
    private double balance;

    public Customer(String name, double balance) {
        Name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public double getBalance() {
        return balance;
    }
}
