package strategy;

public class ScreamQuackBehaviour implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Scream like a Duck.");
    }
}
