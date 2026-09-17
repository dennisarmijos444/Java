package ec.edu.espoch.mecanica;

public class Car {
    
    //ATRIBUTOS
    public String color;
    public String brand;
    public String model;
    public boolean state;
    
    //METODOS
    public void started(){
        System.out.println("CARRO ENCENDIDO");
 }  
    
    public void stopped(){
        System.out.println("CARRO APAGADO");
    }
    
public void acelerate (){
    System.out.println("Aceleraste el carro");
}

public void brake (){  
    System.out.println("Frenaste el carro");
}

}
