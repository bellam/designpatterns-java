package command;

public class RemoteInvoker {

    private IButtonCommand mOn;

    private IButtonCommand mOff;

    private IButtonCommand mDimmer;

    private IButtonCommand mUpper;

    public RemoteInvoker(IButtonCommand on, IButtonCommand off, IButtonCommand upper, IButtonCommand dimmer) {
        this.mOn = on;
        this.mOff = off;
        this.mUpper = upper;
        this.mDimmer = dimmer;
    }

    public void clickOn() {
        this.mOn.execute();
    }

    public void clickOff() {
        this.mOff.execute();
    }

    public void clickUpper() {
        this.mUpper.execute();
    }

    public void clickDimmer() {
        this.mDimmer.execute();
    }
}
