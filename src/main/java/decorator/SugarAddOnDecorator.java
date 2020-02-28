package decorator;

public class SugarAddOnDecorator implements AddOnDecorator {

    private Beverage mBeverage;

    public SugarAddOnDecorator(Beverage pBeverage) {
        this.mBeverage = pBeverage;
    }

    public String getDescription() {
        return "Sugar + "+ this.mBeverage.getDescription();
    }

    public int getCost() {
        return this.mBeverage.getCost() + 3;
    }
}
