package decorator;

public class ChocolateAddOnDecorator implements AddOnDecorator {

    private Beverage mBeverage;

    public ChocolateAddOnDecorator(Beverage pBeverage) {
        this.mBeverage = pBeverage;
    }

    public String getDescription() {
        return "Chocolate + "+ this.mBeverage.getDescription();
    }

    public int getCost() {
        return this.mBeverage.getCost() + 2;
    }
}
