package decorator;

public class DecafBeverage implements Beverage {

    public String getDescription() {
        return "Decaf";
    }

    public int getCost() {
        return 10;
    }
}
