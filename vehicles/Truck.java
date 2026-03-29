package vehicles;

public class Truck extends MotorVehicle implements CargoCarrier {

    private static final double MAX_CARGO_WEIGHT_KG = 10_000;

    private final int seats;
    private final boolean hasTrailer;
    private double cargoWeightKg;

    public Truck(Owner owner,
                 int averageSpeedKmH,
                 int numberOfWheels,
                 Engine engine,
                 int seats,
                 boolean hasTrailer) {

        super(owner, averageSpeedKmH, numberOfWheels, engine);

        if (numberOfWheels < 6) {
            throw new IllegalArgumentException("A truck must have at least 6 wheels");
        }

        if (seats <= 0 || seats > 3) {
            throw new IllegalArgumentException("A truck must have between 1 and 3 seats");
        }

        this.seats = seats;
        this.hasTrailer = hasTrailer;
        this.cargoWeightKg = 0;
    }

    @Override
    public void honk() {
        System.out.println("Truck honks: HOOONK!");
    }

    @Override
    public void loadCargo(double weightKg) {
        if (weightKg <= 0) {
            throw new IllegalArgumentException("Cargo weight must be greater than zero");
        }

        if (cargoWeightKg + weightKg > MAX_CARGO_WEIGHT_KG) {
            throw new IllegalArgumentException(
                    "Max cargo weight is " + MAX_CARGO_WEIGHT_KG + " kg"
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
        return MAX_CARGO_WEIGHT_KG;
    }

    public int getSeats() {
        return seats;
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }
}