package ch19_memento;

public class Speedometer3 {
    // State of originator
    private int currentSpeed;
    private int previousSpeed;

    public Speedometer3() {
        currentSpeed = 0;
        previousSpeed = 0;
    }

    public void setCurrentSpeed(int speed) {
        previousSpeed = currentSpeed;
        currentSpeed = speed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public SpeedometerMemento3 createMemento() {
        return new SpeedometerMemento3(currentSpeed, previousSpeed);
    }

    public void setMemento(SpeedometerMemento3 memento) {
        currentSpeed = memento.getCurrentSpeed();
        previousSpeed = memento.getPreviousSpeed();
    }
}
