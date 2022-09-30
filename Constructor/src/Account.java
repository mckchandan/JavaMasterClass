public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phonenumber;


    public Account(){
        System.out.println("Empty Constructor");
    }

    public Account(String name,String number,String phonenumber,double balance,String email){
        this.name = name;
        this.number = number;
        this.email = email;
        this.balance = balance;
        this.phonenumber = phonenumber;
    }
    public void deposit(double amount){
        this.balance +=amount;
        System.out.println("Deposited :" + amount + " in your Account \nCurrent Balance is " + balance);
    }

    public void withdraw(double amount){
        if(this.balance - amount <0)
            System.out.println("Not sufficient Balance");
        else {
            this.balance -= amount;
            System.out.println("Withdrawn :" + amount + "from your Account \nCurrent Balance is " + balance);
        }
    }

    public void displayInfo(){
        System.out.println("Name " + getName() );
        System.out.println("Account Number" + getNumber());
        System.out.println("Email " + getEmail());
        System.out.println("Phone Number " + getPhonenumber());
        System.out.println("Balance " + getBalance());
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}


