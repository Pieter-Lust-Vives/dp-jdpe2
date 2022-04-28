package ch15_command_with_exercises;

public class FanDownCommand implements Command {

    private Fan fan;

    public FanDownCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.speedDown();
    }
}
