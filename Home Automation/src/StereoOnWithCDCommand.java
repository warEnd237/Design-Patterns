public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd("cd");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
