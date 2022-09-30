public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public VipCustomer(String name,  String email) {
        this.name = name;
        this.creditLimit= 100000;
        this.email = email;
    }

    public void display(){
        System.out.println("Name " + this.name);
        System.out.println("Credit Limit " + this.creditLimit);
        System.out.println("Email " + this.email);
        System.out.println("");
    }

    public VipCustomer(){
        this.name = "Chandan";
        this.creditLimit = 100000;
        this.email = "mckchandan1999@gmail.com";
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
