public class Car extends Vehicle {
    private int seats;
    private Boolean isAutomatic;

    public Car(int wheels, String name, Boolean isAutomatic) {
        super(wheels, name);
        this.seats = 7;
        this.isAutomatic = isAutomatic;
    }

    public void setSeats(int seats) {
        this.seats = seats;
        System.out.println("Number of seats Changed to " + this.seats);
    }
}
