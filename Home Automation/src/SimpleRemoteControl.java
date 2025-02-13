public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() {}
    public void setCommand(Command c) {
        slot = c;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
