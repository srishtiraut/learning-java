//do-while loop example

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        float d;
        
        int option;
        
        do{
            System.out.println("Enter 2 nos.");
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.println("Choose option: 1. add   2. subtract     3. multiply     4. divide");
            option = sc.nextInt();
            
            switch(option){
                case 1: //add
                    c = a+b;
                    System.out.println(c);
                    break;
                case 2:
                    c = a-b;
                    System.out.println(c);
                    break;
                case 3:
                    c = a*b;
                    System.out.println(c);
                    break;
                case 4:
                    d = ((float)a)/b;
                    System.out.println(d);
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("Want to continue? Press 1");
            option = sc.nextInt();
            
        }while(option==1);
    }
}