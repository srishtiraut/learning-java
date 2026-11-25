/* Java pgm for interfaces and abstract classes and multiple inheritance  */ 
import java.util.*;

interface Shape{
    //getArea member NoSuchMethodError
    double getArea();   //public and abstract by default; mentioning so is optional
}

class Square implements Shape{  //regular class; child of Shape
    
    private int side;
    
    //constructor
    public Square(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side:");
        side  = sc.nextInt();
    }
    
    public double getArea(){
        //overriding
        return side*side;
        
    }
}

public class Main
{
	public static void main(String[] args) {
		Square s = new Square();
		
		double a = s.getArea();
		System.out.println("Area is " + a);
	}
}