package vehicles;

public class Bicycle extends Vehicle {

    private final int seats;
    private final boolean hasBell;

    public Bicycle(Owner owner, int averageSpeedKmH, int seats, boolean hasBell) {
        this(owner, averageSpeedKmH, 2, seats, hasBell);
    }

    protected Bicycle(Owner owner, int averageSpeedKmH, int numberOfWheels, int seats, boolean hasBell) {
        super(owner, averageSpeedKmH, numberOfWheels);

        if (numberOfWheels < 2) {
            throw new IllegalArgumentException("A bicycle must have at least 2 wheels");
        }

        if (seats <= 0 || seats > 2) {
            throw new IllegalArgumentException("A bicycle must have 1 or 2 seats");
        }

        this.seats = seats;
        this.hasBell = hasBell;
    }

    @Override
    public void honk() {
        if (hasBell) {
            System.out.println("Bicycle rings the bell: ring ring!");
        } else {
            System.out.println("Bicycle makes a warning sound");
        }
    }

    public void pedal() {
        System.out.println("Bicycle is powered by pedaling");
    }

    public void push() {
        System.out.println("Bicycle is pushed by a person");
    }

    public int getSeats() {
        return seats;
    }

    public boolean hasBell() {
        return hasBell;
    }
}