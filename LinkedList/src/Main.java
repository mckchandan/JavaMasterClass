public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Chandan",49000);
        Customer otherCustomer;
        otherCustomer = customer;
        otherCustomer.setBalance(54000);
        System.out.println(customer.getBalance());
    }
}