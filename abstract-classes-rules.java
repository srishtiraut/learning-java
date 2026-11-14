import java.util.*;

abstract class Vehicle {
	abstract void start();
	abstract void stop();
	abstract void run();
}

abstract class Bike extends Vehicle {   //child class; it is abstract
	//overriding start() from parent Vehicle
	//overriding abstract methods is not mandatory
	void start() {
		System.out.println("Hi from Bike's start()");
	}
	
    void display(){     //not an abstract method
	    System.out.println("Hi from Bike's display()");
	}
}

class Bajaj extends Bike {      //child class; it is not abstract
	//overriding all methods from parent class Vehicle and Bike
	//overriding ALL abstract methods(that were never overridden) from parent is mandatory

	//start() was overridden in parent Bike class. Hence skipping.
	//overriding stop() and run() below
	void stop() {
		System.out.println("Hi from Bajaj's stop()");
	}

    void run() {
		System.out.println("Hi from Bajaj's run()");
	}

    //We could have overridden display() from Bike into Bajaj but we have not;
    //because display() was not abstract method of Bike.
}

public class Main
{
	public static void main(String[] args) {
		Bajaj bj1 = new Bajaj();
		
		bj1.start();
		bj1.run();
		bj1.stop();
		bj1.display();
	}
}