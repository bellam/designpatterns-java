package command;

public class DimmerButtonCommand implements IButtonCommand {

    private final LightReceiver mReceiver;

    public DimmerButtonCommand(LightReceiver pReceiver) {
        this.mReceiver = pReceiver;
    }

    @Override
    public void execute() {
        this.mReceiver.dimmer();
    }

    @Override
    public void unexecute() {
        this.mReceiver.upper();
    }
}