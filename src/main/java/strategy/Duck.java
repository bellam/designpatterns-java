package strategy;

public class Duck implements IFlyBehaviour, IQuackBehaviour {

    private IFlyBehaviour mf;
    private IQuackBehaviour mq;

    public Duck(IFlyBehaviour pf, IQuackBehaviour pq) {
        this.mf = pf;
        this.mq = pq;
    }

    @Override
    public void fly() {
        if (this.mf == null) {
            System.out.println("Generic Fly. Bound to crash. Duh!");
            return;
        }
        this.mf.fly();
    }

    @Override
    public void quack() {
        if (this.mq == null) {
            System.out.println("Baaa Baaa Baaaa...");
            return;
        }
        this.mq.quack();
    }
}
