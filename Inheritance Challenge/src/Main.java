public class Main {
    public static void main(String[] args) {
        Audi model= new Audi(8,true,"model X");
        System.out.println(model.getName());
        model.setSeats(85);
        model.setName("Chandan");
        System.out.println(model.getName());
    }
}