public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String color;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String color) {
        super(name, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.color = color;
    }
    private void chew(){
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat(String name) {
        super.eat(name);
        System.out.println("Dog is eating");
        chew();
        super.eat(name);
    }

    public void walk(){
        System.out.println("Dog is walking");
        move(454);
    }

    public void run(){
        System.out.println("Dog is running");
        move(678);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is moving");

        super.move(speed);
    }
}
