package vehicles;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public abstract class Vehicle {

    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private final Owner owner;
    private final int averageSpeedKmH;
    private final int numberOfWheels;
    private int mileageKm;

    protected Vehicle(Owner owner, int averageSpeedKmH, int numberOfWheels) {
        this.owner = Objects.requireNonNull(owner, "Owner must not be null");

        if (averageSpeedKmH <= 0) {
            throw new IllegalArgumentException("Average speed must be greater than zero");
        }

        if (numberOfWheels <= 0) {
            throw new IllegalArgumentException("Number of wheels must be greater than zero");
        }

        this.averageSpeedKmH = averageSpeedKmH;
        this.numberOfWheels = numberOfWheels;
        this.mileageKm = 0;
    }

    public final void drive(Route route) {
        Objects.requireNonNull(route, "Route must not be null");

        LocalDateTime departureTime = LocalDateTime.now();
        double travelDurationHours = (double) route.distanceKm() / averageSpeedKmH;
        long travelDurationSeconds = Math.round(travelDurationHours * 3600);
        LocalDateTime arrivalTime = departureTime.plusSeconds(travelDurationSeconds);

        mileageKm += route.distanceKm();

        System.out.println("========================================");
        System.out.println("Vehicle: " + getVehicleType());
        System.out.println("Owner: " + owner);
        System.out.println("Route: " + route);
        System.out.println("Departure: " + departureTime.format(DATE_TIME_FORMATTER));
        System.out.println("Arrival: " + arrivalTime.format(DATE_TIME_FORMATTER));
        System.out.println("Travel time: " + String.format(Locale.US, "%.2f", travelDurationHours) + " hours");
        System.out.println("Updated mileage: " + mileageKm + " km");
        System.out.println("========================================");
    }

    public String getVehicleType() {
        return getClass().getSimpleName();
    }

    public abstract void honk();

    public Owner getOwner() {
        return owner;
    }

    public int getAverageSpeedKmH() {
        return averageSpeedKmH;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getMileageKm() {
        return mileageKm;
    }
}