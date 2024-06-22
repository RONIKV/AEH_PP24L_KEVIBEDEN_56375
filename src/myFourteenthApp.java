interface FuelType {
    String getFuelType();
}

abstract class Vehicle implements FuelType {
    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected double price;
    protected double fuelConsumption;
    protected double fuelLevel;
    protected double mileage;

    public Vehicle(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public abstract void drive(double distance);
    public abstract void refuel(double fuel);
}

class PassengerCar extends Vehicle {
    private int numberOfDoors;

    public PassengerCar(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = (distance / 100) * fuelConsumption;
        if(fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            mileage += distance;
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }

    @Override
    public void refuel(double fuel) {
        fuelLevel += fuel;
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, double loadCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = (distance / 100) * fuelConsumption;
        if(fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            mileage += distance;
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }

    @Override
    public void refuel(double fuel) {
        fuelLevel += fuel;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, boolean hasSidecar) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = (distance / 100) * fuelConsumption;
        if(fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            mileage += distance;
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }

    @Override
    public void refuel(double fuel) {
        fuelLevel += fuel;
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }
}

class ConstructionEquipment extends Vehicle {
    private double hoursWorked;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, double hoursWorked) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void drive(double distance) {
        System.out.println("Construction equipment is not typically driven over distances.");
    }

    @Override
    public void refuel(double fuel) {
        fuelLevel += fuel;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }
}

public class myFourteenthApp {
    public static void main(String[] args) {
        // Create example vehicles
        PassengerCar car = new PassengerCar("ABC123", "1HGCM82633A123456", "Red", 20000, 8, 50, 12000, 4);
        Truck truck = new Truck("DEF456", "1FTSW21P16EB12345", "Blue", 30000, 15, 70, 15000, 2000);
        Motorcycle bike = new Motorcycle("GHI789", "JH2RC4467RM123456", "Black", 10000, 5, 20, 5000, false);
        ConstructionEquipment excavator = new ConstructionEquipment("JKL012", "YW56RVE56GB123456", "Yellow", 50000, 25, 100, 3000, 150);


        car.drive(100);
        System.out.println("Car fuel level after drive: " + car.fuelLevel);
        car.refuel(20);
        System.out.println("Car fuel level after refuel: " + car.fuelLevel);

        truck.drive(50);
        System.out.println("Truck fuel level after drive: " + truck.fuelLevel);
        truck.refuel(30);
        System.out.println("Truck fuel level after refuel: " + truck.fuelLevel);

        bike.drive(150);
        System.out.println("Bike fuel level after drive: " + bike.fuelLevel);
        bike.refuel(10);
        System.out.println("Bike fuel level after refuel: " + bike.fuelLevel);

        excavator.refuel(50);
        System.out.println("Excavator fuel level after refuel: " + excavator.fuelLevel);
    }
}
