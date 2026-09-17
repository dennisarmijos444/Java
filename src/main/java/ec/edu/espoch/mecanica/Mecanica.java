package ec.edu.espoch.mecanica;

public class Mecanica {

    public static void main(String[] args) {
        
       int numero = 10;
       
       Car carOne=new Car();
       Car carTwo=new Car();
       Person personOne=new Person();
       Person personTwo=new Person();
       Person personTree=new Person ();
       personOne.name= "Dennis ";
       personTwo.name ="Manuel ";
       personTree.name ="Martinez ";
       
       personOne.drive(true);
       personTwo.getIn();
       personTree.getOut();
       
       carOne.started();
       carTwo.stopped();
       
    }
}
