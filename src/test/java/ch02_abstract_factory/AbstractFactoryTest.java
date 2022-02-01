package ch02_abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    @Test
    void carFactoryCreatesCarParts() {
        // arrange
        AbstractVehicleFactory factory = new CarFactory();

        // act
        Body body = factory.createBody();
        Chassis chassis = factory.createChassis();
        Windows windows = factory.createWindows();

        // assert
        assertTrue(body instanceof CarBody &&
                chassis instanceof CarChassis &&
                windows instanceof CarWindows);
    }

    @Test
    void vanFactoryCreatesVanParts() {
        // arrange
        AbstractVehicleFactory factory = new VanFactory();

        // act
        Body body = factory.createBody();
        Chassis chassis = factory.createChassis();
        Windows windows = factory.createWindows();

        // assert
        assertTrue(body instanceof VanBody &&
                chassis instanceof VanChassis &&
                windows instanceof VanWindows);
    }
}