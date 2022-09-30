public class Audi extends Car {
    public String Model;

    public Audi(int wheels, Boolean isAutomatic, String model) {
        super(wheels, "Audi", isAutomatic);
        this.Model = model;
    }

}
