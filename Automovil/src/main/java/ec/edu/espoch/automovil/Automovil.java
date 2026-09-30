package ec.edu.espoch.automovil;


public class Automovil {

    public static void main(String[] args) {

        CAR car = new CAR("Toyota", 2025, 2.0, Combustible.GASOLINE, Tipo.SUV, 4, 5, 200, Color.RED );

        // Mostrar información del automóvil
        car.show();

        // Velocidad inicial
        car.setCurrentSpeed(100);

        System.out.println("\nVelocidad inicial: " + car.getCurrentSpeed() + " km/h");
    
        car.accelerate(20);
        
        car.decelerate(50);

        car.brake();

        System.out.println("Velocidad final: " + car.getCurrentSpeed() + " km/h");
    }
}