/*
write java program
Vehicle class

data member: vehicleregistration number, vehicle price
member method: accept(), display()

Bike is subclass of Vehicle
data members: discountrate
member method: accept(), display(), calculateNewPrice()

Accept the details of bike and display its details and calculate new price of bike after applying discount
*/

import java.util.*;

class Vehicle{
    //data members
    int vnum;
    float vprice;
    
    Scanner sc = new Scanner(System.in);
    
    //member fx
    public void accept(){ 
        System.out.println("Enter vehicle's registration number: ");
        vnum = sc.nextInt();
        
        System.out.println("Enter vehicle's price: ");
        vprice = sc.nextFloat();
    }
    
    public void display(){
        System.out.println("Vehicle's registration number is: "+vnum);
        System.out.println("Vehicle's price is: "+vprice);
    }
}

/*Bike is subclass of Vehicle
data members: discountrate
member method: accept(), display(), calculateNewPrice()*/


class Bike extends Vehicle{
    private float drate, newprice;  //discountrate
    
    public void accept(){
        
        super.accept();
        
        System.out.println("Enter discount rate: ");
        drate = sc.nextFloat();
    }
    
    public void calculateNewPrice(){
        newprice = vprice - (vprice*drate/100);
        System.out.println("After discount, price of the bike is:" + newprice);
    }
    
    public void display(){
        
        System.out.println("Your bike's details:");
        
        super.display();
        
        calculateNewPrice();
    }
    
}

public class Main
{
	public static void main(String[] args) {
	   
	   Bike b1 = new Bike();
	   b1.accept();
	   b1.display();
	   
	}
}