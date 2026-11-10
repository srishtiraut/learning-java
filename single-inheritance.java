//java pgm to accept and display details of college and university
import java.util.*;

class University{
    private String uname, uwebsite;
    Scanner sc = new Scanner(System.in);
    
    public void acceptUniversity(){
        System.out.println("Enter uname");
        uname = sc.next();
        
        System.out.println("Enter uwebsite");
        uwebsite = sc.next();
    }
    
    public void displayUniversity(){
        System.out.println("uname was: "+uname);
        System.out.println("uwebsite was: "+uwebsite);
    }
}


//single inheritance
class College extends University{
    private String cname, cwebsite;
    Scanner sc = new Scanner(System.in);
    
    public void acceptCollege(){
        System.out.println("Enter cname");
        cname = sc.next();
        
        System.out.println("Enter cwebsite");
        cwebsite = sc.next();
    }
    
    public void displayCollege(){
        System.out.println("cname was: "+cname);
        System.out.println("cwebsite was: "+cwebsite);
    }
}


public class Main
{
	public static void main(String[] args) {
	    
	    College c1 = new College();  //creating object of lowermost subclass
	    
	    c1.acceptCollege();
	    c1.acceptUniversity();
	    
	    c1.displayCollege();
	    c1.displayUniversity();
		}
}