 
 
import java.util.*;

class A{
    //no display() method in class A
}

class B extends A{
    void display(){
        System.out.println("Hi from B's display");
    }
}

class C extends A{
    void display(){
        System.out.println("Hi from C's display");
    }
}
 
public class Main
{
	public static void main(String[] args) {
	
	A a1 = new C();
	//((B)a1).display();       //gives ClassCastException
	
	// correction below 
	if (a1 instanceof B){
	    ((B)a1).display(); 
	}else{
	    ((C)a1).display(); 
	} 
	}
}