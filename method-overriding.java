import java.util.*;

class Payment { //parent class
	
	public void processPayment () {      //overriddenMethod
		   System.out.println("Processing payment...//parent class");
	}
}

class UpiPayment extends Payment {  //child class

	public void processPayment() {        //overriding method
		System.out.println("Processing UPI payment...//child class");
	}

}
public class Main
{
	public static void main(String[] args) {
	Payment p1 = new Payment();
	p1.processPayment();
    
    UpiPayment up1 = new UpiPayment();
    up1.processPayment();

    //method overriding example
    Payment mix1 = new UpiPayment();
    mix1.processPayment();
	}
}