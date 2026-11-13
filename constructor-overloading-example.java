import java.util.*;

//java pgm to demonstrate constructor overloading

class Student{
    
    //data members
    String name;
    int age;
    
    //member functions
    //no args constructor
    Student(){
        this.name = "unknown";
        this.age = 0;
    }
    
    //parameterized constructor with 1 parameter
    //overloading
    Student(String n){
        this.name = n;
        this.age = 0;
    }
    
    //parameterized constructor having both parameters
    //overloading
    Student(String n, int a){
        this.name = n;
        this.age = a;
    }
    
    //display function
    public void display(){
        System.out.println("Name is: "+ this.name);
        System.out.println("Age is: "+ this.age);
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Student s1 = new Student(); //automatically calls no args constructor
	    s1.display();
	    
	    //call parameterized constructors
	    Student s2 = new Student("Srishti");    //1 parameter passed while creating object
	    s2.display();
	    
	    Student s3 = new Student("Srishti", 23);    //2 parameters passed while creating object
	    s3.display();
	}
}


/*
Output:
Name is: unknown
Age is: 0
Name is: Srishti
Age is: 0
Name is: Srishti
Age is: 23

*/


/*
Output:
Name is: unknown
Age is: 0
Name is: Srishti
Age is: 0
Name is: Srishti
Age is: 23

*/