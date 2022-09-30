public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Labrador",60,67);
        Dog dog = new Dog("Guffy",89,78,2,3,7,5,"Brown");
        dog.eat(dog.getName());
        dog.walk();
        System.out.println("\n\nFish");
    }
}