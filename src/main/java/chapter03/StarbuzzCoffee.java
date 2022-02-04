package chapter03;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        System.out.println("beverage2.getDescription() = " + beverage2.getDescription());
        System.out.println("beverage2.cost() = " + beverage2.cost());
    }
}
