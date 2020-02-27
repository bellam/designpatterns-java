package command;

public class OffButtonCommand implements IButtonCommand {

    private LightReceiver mReceiver;

    public OffButtonCommand(LightReceiver pReceiver) {
        this.mReceiver = pReceiver;
    }

    @Override
    public void execute() {
        this.mReceiver.off();
    }

    @Override
    public void unexecute() {
        this.mReceiver.on();
    }
}
