/*
write java program for multi level inheritance
Square
data members:side
member function:constructor,peri()

Rectangle is subclass of Square
data member:breadth
member function:constructor,peri()

Triangle is subclass of Rectangle
data member:side3
member function:constructor,peri()

accept lengths of sides of square,rectangle and triangle and find perimeter
of each
*/

import java.util.*;

class Square{
    float side;
    Scanner sc = new Scanner(System.in);
    
    public Square(){  //constructor
        System.out.println("Enter side of square");
        side = sc.nextFloat();
    }
    
    public void peri(){
        System.out.println("perimeter of square is:" + (side*4));
    }
}

class Rectangle extends Square{
    float breadth;
    public Rectangle(){
        super(); //calls the constructor of superclass Square from subclass
        System.out.println("Enter breadth of rectangle");
        breadth = sc.nextFloat();
    }
    
    public void peri(){
        super.peri();
        System.out.println("perimeter of rectangle is:" + (2*(side+breadth)));
    }
}

class Triangle extends Rectangle{
    private float side3;
    
    //constructor
    public Triangle(){
        super(); //calls the constructor of superclass Rectangle from subclass
        System.out.println("Enter side3 of triangle");
        side3 = sc.nextFloat();
    }
    
    public void peri(){
        super.peri();
        System.out.println("perimeter of triangle is:" + (side3+side+breadth));
    }
}
    


public class Main
{
	public static void main(String[] args) {
	    Triangle t1 = new Triangle();
	    t1.peri();
		}
}