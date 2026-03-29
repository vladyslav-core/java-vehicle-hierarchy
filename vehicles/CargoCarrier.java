package vehicles;

public interface CargoCarrier {

    void loadCargo(double weightKg);

    double getCargoWeightKg();

    double getMaxCargoWeightKg();

    default boolean hasCargo() {
        return getCargoWeightKg() > 0;
    }

    default double getRemainingCargoCapacityKg() {
        return getMaxCargoWeightKg() - getCargoWeightKg();
    }
}