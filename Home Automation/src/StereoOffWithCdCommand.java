public class StereoOffWithCdCommand implements Command {
    Stereo stereo;

    public StereoOffWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
