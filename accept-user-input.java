import java.util.*;

class Student{
    //data members
    private String name, schname;
    private int rno, age;
    private float per;
    
    //member functions
    public void accept(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name:");
        name = sc.next();
       
        System.out.println("Enter schname:");
        schname = sc.next();
        
        rno = sc.nextInt();
        age = sc.nextInt();
        per = sc.nextFloat();
       
    }
    
    public void display(){
        System.out.println(name+ " has scored "+ per );
        System.out.println("rno: "+rno );
        System.out.println("age: "+ age);
        
    }
}

class Main{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.accept();
        s1.display();
    }
}