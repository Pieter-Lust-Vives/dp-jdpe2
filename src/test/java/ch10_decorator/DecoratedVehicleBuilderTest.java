package ch10_decorator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class DecoratedVehicleBuilderTest {

    @Test
    void AddAirconditioningDecoratesWithAirconditionedVehicle() {
        // arrange
        Vehicle myCar = new Saloon(new StandardEngine(1300));
        myCar.paint(Vehicle.Colour.BLUE);

        // act
        myCar = DecoratedVehicleBuilder.startBuilding(myCar)
                                        .addAirconditioning()
                                        .getFinishedVehicle();

        // assert
        assertThat(myCar).isInstanceOf(AirConditionedVehicle.class);
    }

    @Test
    void AddAlloyWheelsDecoratesWithAlloyWheeledVehicle() {
        // arrange
        Vehicle myCar = new Saloon(new StandardEngine(1300));
        myCar.paint(Vehicle.Colour.BLUE);

        // act
        myCar = DecoratedVehicleBuilder.startBuilding(myCar)
                .addAlloyWheels()
                .getFinishedVehicle();

        // assert
        assertThat(myCar).isInstanceOf(AlloyWheeledVehicle.class);
    }

    @Test
    void AddLeatherSeatsDecoratesWithLeatherSeatedVehicle() {
        // arrange
        Vehicle myCar = new Saloon(new StandardEngine(1300));
        myCar.paint(Vehicle.Colour.BLUE);

        // act
        myCar = DecoratedVehicleBuilder.startBuilding(myCar)
                .addLeatherSeats()
                .getFinishedVehicle();

        // assert
        assertThat(myCar).isInstanceOf(LeatherSeatedVehicle.class);
    }

    @Test
    void AddMetallicPaintDecoratesWithMetallicPaintedVehicle() {
        // arrange
        Vehicle myCar = new Saloon(new StandardEngine(1300));
        myCar.paint(Vehicle.Colour.BLUE);

        // act
        myCar = DecoratedVehicleBuilder.startBuilding(myCar)
                .addMetallicPaint()
                .getFinishedVehicle();

        // assert
        assertThat(myCar).isInstanceOf(MetallicPaintedVehicle.class);
    }

    @Test
    void AddSatelliteNavigationDecoratesWithSatNavVehicle() {
        // arrange
        Vehicle myCar = new Saloon(new StandardEngine(1300));
        myCar.paint(Vehicle.Colour.BLUE);

        // act
        myCar = DecoratedVehicleBuilder.startBuilding(myCar)
                .addSatelliteNavigation()
                .getFinishedVehicle();

        // assert
        assertThat(myCar).isInstanceOf(SatNavVehicle.class);
    }
}