package ch06_singleton;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SingletonTest {
    @Test
    void SerialNumberGeneratorTraditionalAlwaysReturnsSameInstance() {
        SerialNumberGeneratorTraditional gen1 = SerialNumberGeneratorTraditional.getInstance();
        SerialNumberGeneratorTraditional gen2 = SerialNumberGeneratorTraditional.getInstance();
        assertThat(gen1).isSameAs(gen2);

        // assert (junit style)
        // assertSame(gen1, gen2);
    }

    @Test
    void SerialNumberGeneratorTraditionalHasCounter() {
        int serial1 = SerialNumberGeneratorTraditional.getInstance().getNextSerial();
        int serial2 = SerialNumberGeneratorTraditional.getInstance().getNextSerial();
        assertThat(serial2 - serial1).isEqualTo(1);

        // assert (junit style)
        // assertTrue(serial2 == serial1 + 1);
    }

    @Test
    void SerialNumberGeneratorHasTwoCounters() {
        int vehicleSerial1 = SerialNumberGenerator.VEHICLE.getNextSerial();
        int engineSerial1 = SerialNumberGenerator.ENGINE.getNextSerial();

        int vehicleSerial2 = SerialNumberGenerator.VEHICLE.getNextSerial();
        int engineSerial2 = SerialNumberGenerator.ENGINE.getNextSerial();

        assertThat(vehicleSerial2 - vehicleSerial1).isEqualTo(1);
        assertThat(engineSerial2 - engineSerial1).isEqualTo(1);

        // assert (junit style)
        // assertTrue(vehicleSerial2 - vehicleSerial1 == 1 && engineSerial2 - engineSerial1 == 1);
    }
}