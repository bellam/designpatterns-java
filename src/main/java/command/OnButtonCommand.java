package command;

public class OnButtonCommand implements IButtonCommand {

    private LightReceiver mReceiver;

    public OnButtonCommand(LightReceiver pReceiver) {
        this.mReceiver = pReceiver;
    }

    @Override
    public void execute() {
        this.mReceiver.on();
    }

    @Override
    public void unexecute() {
        this.mReceiver.off();
    }
}
