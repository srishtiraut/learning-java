class Student{
    //data members
    private String name, schname;
    private int rno, age;
    private float per;
    
    //member functions
    public void accept(){
       name = "Srishti";
       schname = "MIT";
       rno = 1;
       age = 25;
       per = 96;
       
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