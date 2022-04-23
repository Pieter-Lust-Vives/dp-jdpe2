package ch10_decorator;

/**
 * A builder for decorated vehicles.
 * To keep this example light, this class does not create the vehicle that will be decorated. It only allows to
 *  add decorators to an existing vehicle.
 */

public class DecoratedVehicleBuilder {
    private Vehicle vehicle;

    private DecoratedVehicleBuilder(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public static DecoratedVehicleBuilder startBuilding(Vehicle vehicle) {
        return new DecoratedVehicleBuilder(vehicle);
    }

    public DecoratedVehicleBuilder addAirconditioning() {
        this.vehicle = new AirConditionedVehicle(vehicle);
        return this;
    }

    public DecoratedVehicleBuilder addAlloyWheels() {
        this.vehicle = new AlloyWheeledVehicle(vehicle);
        return this;
    }

    public DecoratedVehicleBuilder addLeatherSeats() {
        this.vehicle = new LeatherSeatedVehicle(vehicle);
        return this;
    }

    public DecoratedVehicleBuilder addMetallicPaint() {
        this.vehicle = new MetallicPaintedVehicle(vehicle);
        return this;
    }

    public DecoratedVehicleBuilder addSatelliteNavigation() {
        this.vehicle = new SatNavVehicle(vehicle);
        return this;
    }

    public Vehicle getFinishedVehicle() {
        return this.vehicle;
    }
}
