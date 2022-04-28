package ch15_command_with_exercises;

public class Fan {
    public static final int MIN_SPEED = 0;
    public static final int MAX_SPEED = 3;
    public static final int DEFAULT_SPEED = 1;

    private int speed;

    public Fan() {
        speed = DEFAULT_SPEED;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < MIN_SPEED || speed > MAX_SPEED) {
            throw new IllegalArgumentException("invalid speed");
        }

        this.speed = speed;
    }

    public void speedUp() {
        if (getSpeed() < MAX_SPEED) {
            speed++;
        }
    }

    public void speedDown() {
        if (getSpeed() > MIN_SPEED) {
            speed--;
        }
    }

}
