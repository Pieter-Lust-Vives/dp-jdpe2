package ch02_abstract_factory;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

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
        assertThat(body).isInstanceOf(CarBody.class);
        assertThat(chassis).isInstanceOf(CarChassis.class);
        assertThat(windows).isInstanceOf(CarWindows.class);

        // assert (junit style)
        // assertTrue(body instanceof CarBody &&
        //         chassis instanceof CarChassis &&
        //         windows instanceof CarWindows);
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
        assertThat(body).isInstanceOf(VanBody.class);
        assertThat(chassis).isInstanceOf(VanChassis.class);
        assertThat(windows).isInstanceOf(VanWindows.class);

        // assert (junit style)
        // assertTrue(body instanceof VanBody &&
        //         chassis instanceof VanChassis &&
        //         windows instanceof VanWindows);
    }
}