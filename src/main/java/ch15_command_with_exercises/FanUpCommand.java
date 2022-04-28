package ch15_command_with_exercises;

public class FanUpCommand implements Command {
    private Fan fan;

    public FanUpCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.speedUp();
    }
}
