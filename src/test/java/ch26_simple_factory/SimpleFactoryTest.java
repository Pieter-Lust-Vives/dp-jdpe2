package ch26_simple_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleFactoryTest {
    @Test
    void simpleFactoryCreatesGearbox() {
        // arrange

        // act
        Gearbox gb = GearboxFactory.create(GearboxFactory.Type.AUTOMATIC);

        // assert
        // test will fail if returned type is a derived type of AutomaticGearbox
        //assertEquals(gb.getClass().getName(), AutomaticGearbox.class.getName());
        // test will not fail if returned type is a derived type of AutomaticGearbox
        assertTrue(gb instanceof AutomaticGearbox);
    }
}