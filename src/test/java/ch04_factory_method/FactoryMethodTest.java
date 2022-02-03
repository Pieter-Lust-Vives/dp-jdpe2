package ch04_factory_method;

import ch01_introduction.AbstractCar;
import ch01_introduction.AbstractVan;
import ch01_introduction.Vehicle;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class FactoryMethodTest {
    @Test
    void carFactoryCreatesCars() {
        // arrange
        VehicleFactory factory = new CarFactory();

        // act
        Vehicle vehicle = factory.build(VehicleFactory.DrivingStyle.MIDRANGE, Vehicle.Colour.SILVER);

        // assert
        assertThat(vehicle).isInstanceOf(AbstractCar.class);

        // assert (junit style)
        // assertTrue(vehicle instanceof AbstractCar);
    }

    @Test
    void vanFactoryCreatesVans() {
        // arrange
        VehicleFactory factory = new VanFactory();

        // act
        Vehicle vehicle = factory.build(VehicleFactory.DrivingStyle.MIDRANGE, Vehicle.Colour.SILVER);

        // assert
        assertThat(vehicle).isInstanceOf(AbstractVan.class);

        // assert (junit style)
        // assertTrue(vehicle instanceof AbstractVan);
    }
}