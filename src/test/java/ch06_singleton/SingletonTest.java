package ch06_singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    void SerialNumberGeneratorTraditionalAlwaysReturnsSameInstance() {
        // arrange

        // act
        SerialNumberGeneratorTraditional gen1 = SerialNumberGeneratorTraditional.getInstance();
        SerialNumberGeneratorTraditional gen2 = SerialNumberGeneratorTraditional.getInstance();

        // assert
        assertSame(gen1, gen2);
    }

    @Test
    void SerialNumberGeneratorTraditionalHasCounter() {
        // arrange
        int serial1 = SerialNumberGeneratorTraditional.getInstance().getNextSerial();

        // act
        int serial2 = SerialNumberGeneratorTraditional.getInstance().getNextSerial();

        // assert
        assertTrue(serial2 == serial1 + 1);
    }

    @Test
    void SerialNumberGeneratorHasTwoCounters() {
        // arrange
        int vehicleSerial1 = SerialNumberGenerator.VEHICLE.getNextSerial();
        int engineSerial1 = SerialNumberGenerator.ENGINE.getNextSerial();

        // act
        int vehicleSerial2 = SerialNumberGenerator.VEHICLE.getNextSerial();
        int engineSerial2 = SerialNumberGenerator.ENGINE.getNextSerial();

        // assert
        assertTrue(vehicleSerial2 - vehicleSerial1 == 1 && engineSerial2 - engineSerial1 == 1);
    }
}