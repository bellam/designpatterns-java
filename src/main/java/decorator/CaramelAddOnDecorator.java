package decorator;

public class CaramelAddOnDecorator implements AddOnDecorator {

    private Beverage mBeverage;

    public CaramelAddOnDecorator(Beverage pBeverage) {
        this.mBeverage = pBeverage;
    }

    public String getDescription() {
        return "Caramel + "+ this.mBeverage.getDescription();
    }

    public int getCost() {
        return this.mBeverage.getCost() + 1;
    }
}
