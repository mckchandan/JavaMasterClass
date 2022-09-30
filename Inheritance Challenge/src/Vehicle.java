public class Vehicle {
    private int  wheels;
    private String name;
    private int speed;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Vehicle(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;

        this.speed=0;
    }

    public void velocity(int speed) {
        this.speed = speed;
        System.out.println(getName() + " is moving at the speed of " + this.speed);
    }

    public void stop(){
        this.speed=0;
    }
}
