package decorator.caller;

import decorator.*;

public class DecoratorPatterExecutor {

     public static void main(String[] args) {

         Beverage caramelEspressoSugar = new CaramelAddOnDecorator(new SugarAddOnDecorator(new EspressoBeverage()));

         String combo = caramelEspressoSugar.getDescription();
         int amount = caramelEspressoSugar.getCost();
         System.out.println("Order 1 details: " + combo + " --> $" + amount);


         Beverage decafChocolateNoSugar2 = new ChocolateAddOnDecorator(new DecafBeverage());

         String combo2 = decafChocolateNoSugar2.getDescription();
         int amount2 = decafChocolateNoSugar2.getCost();
         System.out.println("Order 2 details: " + combo2 + " --> $" + amount2);
     }
}
