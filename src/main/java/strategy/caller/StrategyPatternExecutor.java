package strategy.caller;

import strategy.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StrategyPatternExecutor {

    public static void main(String[] args) {

        System.out.println("*** STRATEGY PATTERN *** \n");

        Duck eagleScreamDuck = new Duck(new EagleFlyBehaviour(), new ScreamQuackBehaviour());
        Duck jetScreamDuck = new Duck(new JetFlyBehaviour(), new ScreamQuackBehaviour());
        Duck jetIrritatingDuck = new Duck(new JetFlyBehaviour(), new IrritatingQuackBehaviour());
        Duck jetMuteDuck = new Duck(new JetFlyBehaviour(), null);

        List<Duck> ducks = new ArrayList<Duck>();

        ducks.add(jetScreamDuck);
        ducks.add(eagleScreamDuck);
        ducks.add(jetIrritatingDuck);
        ducks.add(jetMuteDuck);

        Iterator<Duck> duckIterator = ducks.iterator();
        while (duckIterator.hasNext()) {
            Duck nowDuck = duckIterator.next();
            nowDuck.fly();
            nowDuck.quack();
            System.out.println("");
        }

    }

}
