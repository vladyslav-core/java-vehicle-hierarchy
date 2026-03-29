package vehicles;

import java.util.Objects;

public abstract class MotorVehicle extends Vehicle {

    private final Engine engine;

    protected MotorVehicle(Owner owner, int averageSpeedKmH, int numberOfWheels, Engine engine) {
        super(owner, averageSpeedKmH, numberOfWheels);
        this.engine = Objects.requireNonNull(engine, "Engine must not be null");
    }

    public Engine getEngine() {
        return engine;
    }

    public void startEngine() {
        System.out.println(getVehicleType() + " engine started");
    }
}