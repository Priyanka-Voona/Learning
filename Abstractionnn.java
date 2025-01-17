package Java;

abstract class Vehicle {
	    abstract void start();
	    
	    void stop()
	    {
	    	System.out.println("Vehicle stop");
	    }
	}

	class Car extends Vehicle {
	    void start() {
	        System.out.println("Car starts with a key.");
	    }
	}

	class Bike extends Vehicle {
	    void start() {
	        System.out.println("Bike starts with a kick.");
	    }
	} 
public class Abstractionnn
{
public static void main(String[] args) {
    Vehicle car = new Car();
    car.start();
    car.stop();   
    Vehicle bike = new Bike();
    bike.start(); 
}
}