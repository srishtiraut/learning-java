
import java.util.*;

class Example{
    
    public int area(int side){
        return side*side;
    }
    
    public int area(int len, int br){ //overloded method; has same name but different parameter list
        return len*br;
    }
    
    public double area(double s1, double s2, double s3){  //overloaded method
        double s = (s1+s2+s3)/2.0;
        double a = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));   //area as per heron's formula
        return a;
    }
    
}



public class Main
{
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Pick a choice: 1. Square's area   2. Rectangle's area   3. Triangle's area");
	   int choice = sc.nextInt();
	   
	   Example a = new Example();
	   
	   switch(choice){
	       case 1: System.out.println("Enter side");
    	       int side = sc.nextInt();
    	       
    	       System.out.print("Area of the square is: " +  a.area(side));
    	       
    	       break;
	       
	       case 2: System.out.println("Enter length and breadth");
    	       int length = sc.nextInt();
    	       int breadth = sc.nextInt();
    	       
    	       System.out.print("Area of the rectangle is: ");
    	       System.out.println(a.area(length, breadth));
    	       
    	       break;
    	       
    	   case 3: System.out.println("Enter 3 sides");
    	       double s1 = sc.nextInt();
    	       double s2 = sc.nextInt();
    	       double s3 = sc.nextInt();
    	       
    	       System.out.print("Area of the triangle is: " + a.area(s1, s2, s3));
    	       
    	       break;
	   
	       default: System.out.println("Invalid choice");
	           break;
	   }
	   
	   
	}
}