package strategy;

public class IrritatingQuackBehaviour implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Irritating Noise. Quck.");
    }
}
