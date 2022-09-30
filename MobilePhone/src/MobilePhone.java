import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >=0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int pos = findContact(name);
        if(pos>=0){
            return this.myContacts.get(pos);
        }
        return null;
    }

    public boolean removeContact(Contact contact){
        int pos = findContact(contact);
        if(pos < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(pos);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1)+ " . " +
                    this.myContacts.get(i).getName() +" -> "+
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0;i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        int pos = findContact(oldContact);
        if(pos < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContacts.set(pos,newContact);
        System.out.println("Contact has been updated");
        return true;
    }
}
