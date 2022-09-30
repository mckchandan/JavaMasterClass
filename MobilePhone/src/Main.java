import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone= new MobilePhone("1234567");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("Enter 6 to show available actions\n");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Shutting down ...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new Contact name");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number ");
        String phno = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phno);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact added");
        } else {
            System.out.println("Cannot add New Contact");
        }
    }

    private static void updateContact(){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        Contact exisitingContactRecord = mobilePhone.queryContact(name);
        if(exisitingContactRecord == null){
            System.out.println("Contact not found ");
            return;
        }
        System.out.println("Enter New Contact name");
        name = scanner.nextLine();
        System.out.println("Enter New Contact number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name,newNumber);
        if(mobilePhone.updateContact(exisitingContactRecord,newContact)){
            System.out.println("Updated successfully");
        } else {
            System.out.println("Error Updating Record");
        }
    }

    private static void removeContact(){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        Contact exisitingContactRecord = mobilePhone.queryContact(name);
        if(exisitingContactRecord == null){
            System.out.println("Contact not found ");
            return;
        }

        if(mobilePhone.removeContact(exisitingContactRecord)){
            System.out.println("Removed Successfully");
        } else {
            System.out.println("Error Deleting Contact");
        }
    }

    private static void queryContact(){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        Contact exisitingContactRecord = mobilePhone.queryContact(name);
        if(exisitingContactRecord == null){
            System.out.println("Contact not found ");
            return;
        }
        System.out.println("Name :" + exisitingContactRecord.getName()+"Phone Number:"+ exisitingContactRecord.getPhoneNumber());
    }
    private static void startPhone(){
        System.out.println("Starting Phone .....");
    }

    private static void printActions(){
        System.out.println("Press\n0 - Shutdown\n"+
                "1 - print Contact\n" +
                "2 - Add new Contact\n" +
                "3 - Update existing contact\n" +
                "4 - Remove Contact\n" +
                "5 - Query Existing Contact \n" +
                "6 - Print all actions");
        System.out.println("Choose your action");
    }
}