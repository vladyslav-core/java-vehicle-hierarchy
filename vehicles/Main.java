package vehicles;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Owner personOwner = new Owner("Max Mustermann", OwnerType.PERSON);
        Owner companyOwner = new Owner("DHL", OwnerType.COMPANY);

        Engine carEngine = new Engine(150);
        Engine truckEngine = new Engine(400);

        Car car = new Car(personOwner, 120, carEngine, 5);
        Truck truck = new Truck(companyOwner, 90, 8, truckEngine, 2, true);
        Bicycle bicycle = new Bicycle(personOwner, 20, 1, true);
        CargoBike cargoBike = new CargoBike(companyOwner, 18, 3, 1, true, 150);

        List<Vehicle> vehicles = List.of(
                car,
                truck,
                bicycle,
                cargoBike
        );

        List<Route> routes = List.of(
                new Route("Linz", "Graz", 220),
                new Route("Linz", "Vienna", 180),
                new Route("Vienna", "Graz", 200),
                new Route("Graz", "Linz", 220)
        );

        System.out.println("=== VEHICLE OVERVIEW ===");
        for (Vehicle vehicle : vehicles) {
            System.out.println(
                    vehicle.getVehicleType()
                            + " | owner=" + vehicle.getOwner()
                            + " | wheels=" + vehicle.getNumberOfWheels()
                            + " | avgSpeed=" + vehicle.getAverageSpeedKmH() + " km/h"
            );
        }

        System.out.println();
        System.out.println("=== SPECIAL ACTIONS ===");

        car.startEngine();
        car.fullThrottle();
        car.honk();

        System.out.println();

        truck.startEngine();
        truck.honk();
        truck.loadCargo(3500);

        System.out.println();

        bicycle.pedal();
        bicycle.honk();

        System.out.println();

        cargoBike.pedal();
        cargoBike.loadCargo(75);
        cargoBike.honk();

        System.out.println();
        System.out.println("=== ROUTES ===");

        for (Route route : routes) {
            System.out.println();
            System.out.println(">>> " + route);

            for (Vehicle vehicle : vehicles) {
                vehicle.drive(route);
            }
        }

        System.out.println();
        System.out.println("=== FINAL MILEAGE ===");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleType() + ": " + vehicle.getMileageKm() + " km");
        }
    }
}