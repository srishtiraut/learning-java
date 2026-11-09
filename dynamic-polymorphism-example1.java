 
import java.util.*;

class A{
    //no display() method in class A
}

class B extends A{
    void display(){
        System.out.println("Hi from B's display");
    }
}
 
public class Main
{
	public static void main(String[] args) {
	
	A a = new B();
	//a.display();
	
	((B)a).display();       //explicit typecasting
	
	}
}