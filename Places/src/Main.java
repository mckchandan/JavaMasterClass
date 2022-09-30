import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Mysore");
        placesToVisit.add("Bangalore");
        placesToVisit.add("Delhi");

        printPlaces(placesToVisit);

        placesToVisit.add(1,"Mangalore");

        printPlaces(placesToVisit);

        placesToVisit.remove(3);

        printPlaces(placesToVisit);

        addInOrder(placesToVisit,"Amazon");

        printPlaces(placesToVisit);

        visit(placesToVisit);

    }

    private static void printPlaces(LinkedList<String> places){
        Iterator<String> i = places.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting - " + i.next());
        }
        System.out.println("=====================");
    }

    private static boolean addInOrder(LinkedList<String> list,String newCity){
        ListIterator<String> stringList = list.listIterator();

        while(stringList.hasNext()){
            int compare = stringList.next().compareTo(newCity);
            if(compare == 0){
                // equal , do not add
                System.out.println(newCity + " is already included as destination");
                return false;
            } else if(compare > 0){
                // new City should appear before this one
                // Bangalore -> Mysore
                stringList.previous();
                stringList.add(newCity);
                return true;
            } else if (compare< 0){
                // Move on to next city
            }
        }
        stringList.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No Cities to Visit");
            return;
        } else {
            System.out.println(" Visiting - " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Vacation is over");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()){
                        System.out.println("Visiting " + listIterator.next());
                    } else {
                        System.out.println("Visted all the cities");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Visiting " + listIterator.previous());
                    } else {
                        System.out.println("Reached the beginning of the Tour");
                    }
                    break;
                case 3 :
                    printMenu();
                    break;

            }
        }
    }

    private static void printMenu(){
        System.out.println("Available Actions\n"
        + " 0 - To quit\n"
        + " 1 - Go to Next City\n"
        + " 2- Go to previous City\n");
    }
}