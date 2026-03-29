package vehicles;

public class CargoBike extends Bicycle implements CargoCarrier {

    private final double maxCargoWeightKg;
    private double cargoWeightKg;

    public CargoBike(Owner owner,
                     int averageSpeedKmH,
                     int numberOfWheels,
                     int seats,
                     boolean hasBell,
                     double maxCargoWeightKg) {

        super(owner, averageSpeedKmH, numberOfWheels, seats, hasBell);

        if (maxCargoWeightKg <= 0) {
            throw new IllegalArgumentException("Max cargo weight must be greater than zero");
        }

        this.maxCargoWeightKg = maxCargoWeightKg;
        this.cargoWeightKg = 0;
    }


    @Override
    public void loadCargo(double weightKg) {
        if (weightKg <= 0) {
            throw new IllegalArgumentException("Cargo weight must be greater than zero");
        }

        if (cargoWeightKg + weightKg > maxCargoWeightKg) {
            throw new IllegalArgumentException(
                    "Max cargo weight is " + maxCargoWeightKg + " kg"
            );
        }

        cargoWeightKg += weightKg;

        System.out.println("Loaded cargo: " + weightKg + " kg");
        System.out.println("Current cargo: " + cargoWeightKg + " kg");
    }

    @Override
    public double getCargoWeightKg() {
        return cargoWeightKg;
    }

    @Override
    public double getMaxCargoWeightKg() {
        return maxCargoWeightKg;
    }
}