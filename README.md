# Java Vehicle Hierarchy

A small Java project showcasing object-oriented design with different vehicle types, including inheritance, abstraction, polymorphism, and cargo handling.

## Overview

This project models several types of vehicles and their shared and specialized behavior:

- Car
- Truck
- Bicycle
- CargoBike

The main goal of the project was to practice core OOP concepts in Java by designing a small but clean class hierarchy.

## Features

- abstract base class: `Vehicle`
- intermediate abstract class: `MotorVehicle`
- inheritance and polymorphism
- interface-based cargo handling with `CargoCarrier`
- immutable value objects using `record`
- route-based travel simulation
- mileage tracking
- constructor validation
- console-based behavior output

## Class Structure

### Main hierarchy

- `Vehicle` – abstract base class for all vehicles
- `MotorVehicle` – abstract subclass for vehicles with an engine
- `Car` – motor vehicle with 4 wheels and seating
- `Truck` – motor vehicle with cargo transport support
- `Bicycle` – human-powered vehicle with bell/horn behavior
- `CargoBike` – bicycle that can also carry cargo

### Supporting types

- `Route` – immutable route object with start, destination, and distance
- `Owner` – immutable owner object
- `OwnerType` – enum for owner category (`PERSON`, `COMPANY`)
- `Engine` – immutable engine object with horsepower
- `CargoCarrier` – interface for cargo transport behavior

## OOP Concepts Used

This project demonstrates:

- abstraction
- inheritance
- polymorphism
- encapsulation
- composition
- interface usage
- constructor-based validation
- clean and meaningful class design

## What the Program Does

The application:

1. creates different vehicle objects
2. stores them in a `List<Vehicle>`
3. demonstrates vehicle-specific actions
4. sends all vehicles through several routes
5. updates and prints mileage information

## Example Routes

- Linz -> Graz (220 km)
- Linz -> Vienna (180 km)
- Vienna -> Graz (200 km)
- Graz -> Linz (220 km)

## Why I Built This

This project started as a learning task and was later refined into a cleaner GitHub portfolio version.

The focus was not on building a large application, but on improving:

- class design
- abstraction decisions
- inheritance structure
- readability
- overall OOP thinking

## How to Run

1. Open the project in IntelliJ IDEA or another Java IDE
2. Run `Main.java`
3. Check the console output

## Possible Future Improvements

- move sources into a `src` folder
- add unit tests
- separate domain logic from console output
- improve reporting for travel results
- extend the project structure for larger applications

## Author

Created as part of my Java learning journey and refined as a portfolio project.
