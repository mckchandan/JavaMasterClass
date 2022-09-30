public class Main {
    public static void main(String[] args) {
       Hamburger hamburger = new Hamburger("Chicken","Lol",3.5,"White");
       hamburger.addHamburgerAddition1("Tomato",0.5);
        hamburger.addHamburgerAddition2("Cheese",0.7);
        hamburger.addHamburgerAddition3("Onion",0.2);
        double price = hamburger.itemizehamburger();
        System.out.println("Total Price is " + price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.6);
        healthyBurger.addHealthAddition1("Egg",6.7);
        healthyBurger.addHealthAddition2("Milk",6.2);
        price = healthyBurger.itemizehamburger();
        System.out.println("Total Price is " + price);

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizehamburger();
        deluxeBurger.addHamburgerAddition3("CHandan",23);

    }
}