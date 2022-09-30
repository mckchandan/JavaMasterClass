import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("Total Items " + groceryList.size());
        for(int i=0;i<groceryList.size();i++){
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
    }

    public void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Removed Item is " + item);
    }

    public String findItem(String item){
//        boolean exists = groceryList.contains(item);
        int position = groceryList.indexOf(item);
        if(position >=0){
            return groceryList.get(position);
        }
        return "Item not Found";
    }
}
