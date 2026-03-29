package vehicles;

import java.util.Objects;

public record Owner(String name, OwnerType type) {

    public Owner {
        Objects.requireNonNull(name, "Owner name must not be null");
        Objects.requireNonNull(type, "Owner type must not be null");

        if (name.isBlank()) {
            throw new IllegalArgumentException("Owner name must not be blank");
        }
    }


    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}