package vehicles;

public record Engine(int horsePower) {

    public Engine {
        if (horsePower <= 0) {
            throw new IllegalArgumentException("Horsepower must be greater than zero");
        }
    }

    @Override
    public String toString() {
        return horsePower + " HP";
    }
}