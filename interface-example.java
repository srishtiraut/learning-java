/* Java pgm for interface implementation*/ 
import java.util.*;

interface StringOperations{
    String toUpper();       //defaut public and abstract
    String toLower();
    String concat();
}

class StringClass implements StringOperations{  //child class
    
    //data members
    String s1, s2, s3, s4;
    Scanner sc = new Scanner(System.in);
    
    //constructor
    public StringClass(){   //constructor has no return type
        System.out.println("Enter 4 strings one by one");
        s1 = sc.next();
        s2 = sc.next();
        s3 = sc.next();
        s4 = sc.next();
    }
    
    //overriding parent's methods
    public String toUpper(){
        return s1.toUpperCase();
    }
    public String toLower(){
        return s1.toLowerCase();
    }
    public String concat(){
        return s3+s4;
    }
}

public class Main
{
	public static void main(String[] args) {
		StringClass sc1 = new StringClass();
		
		System.out.println("Upper: "+sc1.toUpper());
		System.out.println("Lower: "+sc1.toLower());
		System.out.println("Concatenated: "+sc1.concat());
	}
}