package ch19_memento;

public class SpeedometerMemento3 {
    private int currentSpeed;
    private int previousSpeed;

    public SpeedometerMemento3(int currentSpeed, int previousSpeed) {
        this.currentSpeed = currentSpeed;
        this.previousSpeed = previousSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getPreviousSpeed() {
        return previousSpeed;
    }
}
