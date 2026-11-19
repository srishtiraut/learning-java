class A{
 	void display(){
         System.out.println("Display method of A class");
     }
 }

class B extends A{
 	void display(){
         System.out.println("Display method of B class");
     }
 }

class Main {
 	public static void main(String[] args) {
         	A a1 = new B();//object is created of B class
     	//reference variable is created of A class
     	//Since this is an example of runtime binding aka method polymorphism aka dynamic polymorphism, jvm is concerned only about the type of the object, which in this case is B. So B's display method is called.
         a1.display();
     }
 }
