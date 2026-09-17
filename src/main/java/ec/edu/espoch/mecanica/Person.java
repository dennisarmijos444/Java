package ec.edu.espoch.mecanica;

public class Person {
    
    //ATRIBUTOS
    public String name;
    public byte age;
    
    //METODOS
    public void drive(boolean state){
        if (state=true){
            System.out.println(name+"Puedes manejar");
    } else {
            System.out.println("Enciende el carro");
    }
    }
    public void getIn (){
        System.out.println(name + "Ingresaste al carro");
    }
    
    public void getOut (){
        System.out.println(name + "Saliste del carro");
    }
}