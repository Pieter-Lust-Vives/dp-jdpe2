package ch01_introduction;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class AbstractVehicleTest {
    /* Tests use Saloon as concrete type. Any other concrete type derived from
     *  AbstractVehicle should be equivalent.
     */
    @Test
    void newAbstractVehicleWithoutColourIsUnpainted() {
        // arrange

        // act
        AbstractVehicle vehicle = new Saloon(new StandardEngine(1000));

        // assert
        assertThat(vehicle.getColour())
                .as("Vehicle default colour should be UNPAINTED")
                .isEqualTo(Vehicle.Colour.UNPAINTED);

        // assert (junit style)
        // assertEquals(vehicle.getColour(), Vehicle.Colour.UNPAINTED);
    }

    @Test
    void newAbstractVehicleWithColourHasColour() {
        // arrange
        Vehicle.Colour colour = Vehicle.Colour.SILVER;

        // act
        AbstractVehicle vehicle = new Saloon(new StandardEngine(1000), colour);

        // assert
        assertThat(vehicle.getColour())
                .as("Vehicle colour should be %s", colour)
                .isEqualTo(colour);

        // assert (junit style)
        // assertEquals(vehicle.getColour(), colour);
    }

    @Test
    void newAbstractVehicleHasEngine() {
        // arrange
        Engine engine = new StandardEngine(1000);

        // act
        AbstractVehicle vehicle = new Saloon(engine);

        // assert
        assertThat(vehicle.getEngine())
                .isEqualTo(engine);

        // assert (junit style)
        // assertEquals(vehicle.getEngine(), engine);
    }

    @Test
    void paintChangesVehicleColour() {
        // arrange
        Vehicle.Colour colour = Vehicle.Colour.SILVER;
        AbstractVehicle vehicle = new Saloon(new StandardEngine(1000));

        // act
        vehicle.paint(colour);

        // assert
        assertThat(vehicle.getColour())
                .isEqualTo(colour);

        // assert (junit style)
        // assertEquals(vehicle.getColour(), colour);
    }

    @Test
    void AbstractVehicleHasToStringWithClassnameAndEngineAndColour() {
        // arrange
        String className = Saloon.class.getSimpleName();
        Vehicle.Colour colour = Vehicle.Colour.SILVER;
        Engine engine = new StandardEngine(1000);
        AbstractVehicle vehicle = new Saloon(engine, colour);

        // act
        String vehicleString = vehicle.toString();

        // assert
        assertThat(vehicleString)
                .contains(className)
                .contains(engine.toString())
                .contains(colour.toString());

        // assert (junit style)
        // assertTrue(vehicleString.contains(className));
        // assertTrue(vehicleString.contains(engine.toString()));
        // assertTrue(vehicleString.contains(colour.toString()));
    }
}