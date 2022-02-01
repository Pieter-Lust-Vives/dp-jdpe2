package ch01_introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(vehicle.getColour(), Vehicle.Colour.UNPAINTED);
    }

    @Test
    void newAbstractVehicleWithColourHasColour() {
        // arrange
        Vehicle.Colour colour = Vehicle.Colour.SILVER;

        // act
        AbstractVehicle vehicle = new Saloon(new StandardEngine(1000), colour);

        // assert
        assertEquals(vehicle.getColour(), colour);
    }

    @Test
    void newAbstractVehicleHasEngine() {
        // arrange
        Engine engine = new StandardEngine(1000);

        // act
        AbstractVehicle vehicle = new Saloon(engine);

        // assert
        assertEquals(vehicle.getEngine(), engine);
    }

    @Test
    void paintChangesColour() {
        // arrange
        Vehicle.Colour colour = Vehicle.Colour.SILVER;
        AbstractVehicle vehicle = new Saloon(new StandardEngine(1000));

        // act
        vehicle.paint(colour);

        // assert
        assertEquals(vehicle.getColour(), colour);
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
        assertTrue(vehicleString.contains(className));
        assertTrue(vehicleString.contains(engine.toString()));
        assertTrue(vehicleString.contains(colour.toString()));
    }
}