package command;

public class UpperButtonCommand implements IButtonCommand {

    private LightReceiver mLightReceiver;

    public UpperButtonCommand(LightReceiver pLightReceiver) {
        this.mLightReceiver = pLightReceiver;
    }

    @Override
    public void execute() {
        this.mLightReceiver.upper();
    }

    @Override
    public void unexecute() {
        this.mLightReceiver.dimmer();
    }
}
