package ch15_command_with_exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CommandTest {

    @Test
    void fanDownCommandDecreasesFanSpeed() {
        // arrange
        Fan fan = new Fan();
        int speed = 3;
        fan.setSpeed(speed);
        Command cmd = new FanDownCommand(fan);

        // act
        cmd.execute();

        // assert
        assertThat(fan.getSpeed()).isEqualTo(speed - 1);
    }

    @Test
    void fanUpCommandIncreasesFanSpeed() {
        // arrange
        Fan fan = new Fan();
        int speed = 0;
        fan.setSpeed(speed);
        Command cmd = new FanUpCommand(fan);

        // act
        cmd.execute();

        // assert
        assertThat(fan.getSpeed()).isEqualTo(speed + 1);
    }

    @Test
    void volumeDownCommandDecreasesRadioVolume() {
        // arrange
        Radio radio = new Radio();
        radio.on();
        int volume = radio.getVolume();
        Command cmd = new VolumeDownCommand(radio);

        // act
        cmd.execute();

        // assert
        assertThat(radio.getVolume()).isEqualTo(volume - 1);
    }

    @Test
    void volumeUpCommandIncreasesRadioVolume() {
        // arrange
        Radio radio = new Radio();
        radio.on();
        int volume = radio.getVolume();
        Command cmd = new VolumeUpCommand(radio);

        // act
        cmd.execute();

        // assert
        assertThat(radio.getVolume()).isEqualTo(volume + 1);
    }

    @Test
    void windowDownCommandOpensWindow() {
        // arrange
        ElectricWindow window = new ElectricWindow();
        window.closeWindow();
        Command cmd = new WindowDownCommand(window);

        // act
        cmd.execute();

        // assert
        assertThat(window.isOpen()).isTrue();
    }

    @Test
    void windowUpCommandClosesWindow() {
        // arrange
        ElectricWindow window = new ElectricWindow();
        window.openWindow();
        Command cmd = new WindowUpCommand(window);

        // act
        cmd.execute();

        // assert
        assertThat(window.isClosed()).isTrue();
    }

}