package vehicles;

public class Car extends MotorVehicle {

    private final int seats;

    public Car(Owner owner, int averageSpeedKmH, Engine engine, int seats) {
        super(owner, averageSpeedKmH, 4, engine);

        if (seats <= 0 || seats > 7) {
            throw new IllegalArgumentException("A car must have between 1 and 7 seats");
        }

        this.seats = seats;
    }

    @Override
    public void honk() {
        System.out.println("Car honks: beep beep!");
    }

    public void fullThrottle() {
        System.out.println("Car accelerates at full throttle");
    }

    public int getSeats() {
        return seats;
    }
}