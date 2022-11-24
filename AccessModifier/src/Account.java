import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance =0;
    private ArrayList<Integer> transaction;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transaction = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount){
        if(amount>0){
            transaction.add(amount);
            this.balance+=amount;
            System.out.println(amount +" deposited.Current Balance is " + this.balance);
        } else {
            System.out.println("Amount should be greater than 0 to deposit");
        }
    }
    public void withdraw(int amount) {
        if (amount > 0) {
            transaction.add(-amount);
            this.balance -= amount;
            System.out.println(amount +" withdrawn. Current Balance is " + this.balance);
        } else {
            System.out.println("Amount should be greater than 0 to withdraw");
        }
    }

    public void calculateBalance(){
        this.balance =0;
        for(int i : this.transaction){
            this.balance +=i;
        }
        System.out.println("Balance is " + this.balance);
    }
}
