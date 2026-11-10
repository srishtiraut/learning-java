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

//multi-level inheritance
/*
University
    |
    |
    v
College
    |
    |
    v
Professor

*/
class Professor extends College{
    private String pname, pwebsite;
    Scanner sc = new Scanner(System.in);
    
    public void acceptProfessor(){
        System.out.println("Enter pname");
        pname = sc.nextLine();
        
        System.out.println("Enter pwebsite");
        pwebsite = sc.nextLine();
    }
    
    public void displayProfessor(){
        System.out.println("pname was: "+pname);
        System.out.println("pwebsite was: "+pwebsite);
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    Professor p1 = new Professor();  //creating object of lowermost subclass
	    
	    p1.acceptProfessor();
	    p1.acceptCollege();
	    p1.acceptUniversity();
	    
	    p1.displayProfessor();
	    p1.displayCollege();
	    p1.displayUniversity();
		}
}