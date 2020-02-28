package decorator;

public class EspressoBeverage implements Beverage {


    public String getDescription() {
        return "Espresso";
    }

    public int getCost() {
        return 20;
    }
}
