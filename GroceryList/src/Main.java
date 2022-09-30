import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    private static void printInstructions(){
        System.out.println("Press\n1.Print List\n2.Add Item\n3.Modify Item\n4.Remove Item\n5. Search an Item\n6.Exit");
    }
    private static void addItem(){
        System.out.println("Please Enter the Item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem(){
        System.out.println("Please enter the position and value to the modified");
        int position = scanner.nextInt();
        scanner.nextLine();
        String item = scanner.nextLine();
        groceryList.modifyGroceryItem(position-1,item);
    }

    private static void removeItem(){
        System.out.println("Please enter the item to remove");
        int position = scanner.nextInt();
        groceryList.removeGroceryItem(position);
    }

    private static void searchItem(){
        System.out.println("Please Enter an item to Search");
        String item = scanner.nextLine();
        System.out.println(groceryList.findItem(item));
    }

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your Choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
}

