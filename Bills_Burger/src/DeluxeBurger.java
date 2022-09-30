public class DeluxeBurger extends  Hamburger{
    public DeluxeBurger() {
        super("Deluxe","Bacan and Sausage" , 14.54,"white");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drinks",3.41);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add addition to this burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add addition to this burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add addition to this burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add addition to this burger");
    }
}
