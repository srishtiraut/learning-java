 
 
import java.util.*;

class A{
    static void display(){
        System.out.println("Hi from A's display");
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
	a1.display();       //throws error because display() in parent A is static
	}
}