public class Main {
   public static void main(String[] args) {
//        Account newAccount = new Account();
//        newAccount.deposit(50);
//        newAccount.deposit(100);
//        newAccount.setName("Chandan");
//        newAccount.setNumber("123456789");
//        newAccount.setEmail("chandan.kumarm@mitel.com");
//        newAccount.setPhonenumber("7815823757");
//        newAccount.displayInfo();
//
//        Account newAccount1 = new Account("Chinnu","7871589","78155689",4562,"mck@mck.com");
//        newAccount1.displayInfo();
       VipCustomer customer1 = new VipCustomer();
       customer1.display();
       VipCustomer customer2 = new VipCustomer("CHandan","mckchandan1999@gmaiol.com");
       customer2.display();
       VipCustomer customer3 = new VipCustomer("Chandan",1000,"mck@mck.com");
       customer3.display();
    }
}