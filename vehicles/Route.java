package vehicles;

import java.util.Objects;

public record Route(String from, String to, int distanceKm) {

    public Route {
        validateLocation(from, "from");
        validateLocation(to, "to");

        if (distanceKm <= 0) {
            throw new IllegalArgumentException("Distance must be greater than zero");
        }
    }

    private static void validateLocation(String location, String fieldName) {
        Objects.requireNonNull(location, fieldName + " must not be null");

        if (location.isBlank()) {
            throw new IllegalArgumentException(fieldName + " must not be blank");
        }
    }

    @Override
    public String toString() {
        return from + " -> " + to + " (" + distanceKm + " km)";
    }
}