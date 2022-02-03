package ch26_simple_factory;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SimpleFactoryTest {
    @Test
    void simpleFactoryCreatesGearbox() {
        // arrange

        // act
        Gearbox gb = GearboxFactory.create(GearboxFactory.Type.AUTOMATIC);

        // assert
        // test that will fail if returned type is a derived type of AutomaticGearbox
        assertThat(gb).isExactlyInstanceOf(AutomaticGearbox.class);
        // test that will not fail if returned type is a derived type of AutomaticGearbox
        assertThat(gb).isInstanceOf(AutomaticGearbox.class);

        // assert (junit style)
        // test that will fail if returned type is a derived type of AutomaticGearbox
        // assertEquals(gb.getClass().getName(), AutomaticGearbox.class.getName());
        // test that will not fail if returned type is a derived type of AutomaticGearbox
        // assertTrue(gb instanceof AutomaticGearbox);
    }
}