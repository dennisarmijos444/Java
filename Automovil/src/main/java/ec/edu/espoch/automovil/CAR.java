package ec.edu.espoch.automovil;

    
public class CAR {

    // ATRIBUTOS
    private String brand;
    private int model;
    private double engine;
    private Combustible fuelType;
    private Tipo carType;
    private int numberOfDoors;
    private int numberOfSeats;
    private double maximumSpeed;
    private Color color;
    private double currentSpeed;

    // CONSTRUCTOR
    public CAR(String brand, int model, double engine, Combustible fuelType, Tipo carType, int numberOfDoors, int numberOfSeats, double maximumSpeed, Color color) {

        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.currentSpeed = 0;
    }

    // GET Y SET BRAND
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public Combustible getFuelType() {
        return fuelType;
    }

    public void setFuelType(Combustible fuelType) {
        this.fuelType = fuelType;
    }

    public Tipo getCarType() {
        return carType;
    }

    public void setCarType(Tipo carType) {
        this.carType = carType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    // ACELERAR
    public void accelerate(double speed) {

        if (currentSpeed + speed <= maximumSpeed) {
            currentSpeed += speed;
            System.out.println("Velocidad actual: "
                    + currentSpeed + " km/h");
        } else {
            System.out.println(
                    "No puede superar la velocidad máxima."
            );
        }
    }

    // DESACELERAR
    public void decelerate(double speed) {

        if (currentSpeed - speed >= 0) {
            currentSpeed -= speed;
            System.out.println("Velocidad actual: "
                    + currentSpeed + " km/h");
        } else {
            System.out.println(
                    "La velocidad no puede ser negativa."
            );
        }
    }

    // FRENAR
    public void brake() {
        currentSpeed = 0;
        System.out.println("El automóvil se detuvo.");
    }

    // TIEMPO ESTIMADO
    public double estimatedArrivalTime(double distance) {

        if (currentSpeed > 0) {
            return distance / currentSpeed;
        } else {
            System.out.println("El automóvil está detenido.");
            return 0;
        }
    }

    // MOSTRAR INFORMACIÓN
    public void show() {

        System.out.println("----- INFORMACIÓN DEL AUTOMÓVIL -----");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Motor: " + engine + " L");
        System.out.println("Combustible: " + fuelType);
        System.out.println("Tipo: " + carType);
        System.out.println("Número de puertas: " + numberOfDoors);
        System.out.println("Número de asientos: " + numberOfSeats);
        System.out.println("Velocidad máxima: "
                + maximumSpeed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: "
                + currentSpeed + " km/h");
    }
}