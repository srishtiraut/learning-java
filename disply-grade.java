// Java pgm to accept 5 subjects' scores and display grade

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find mod value: ");
        
        float s1 = sc.nextFloat();
        float s2 = sc.nextFloat();
        float s3 = sc.nextFloat();
        float s4 = sc.nextFloat();
        float s5 = sc.nextFloat();
        
        float total = (s1+s2+s3+s4+s5)/5;
        
        System.out.println("total:" + total);
        
        if(total>=80){   
            System.out.print("A");
        }else if(total<80 && total>=60){
            System.out.print("B");
        }else if(total<60 && total>=50){
            System.out.print("C");
        }else if(total<=50 && total>40){
            System.out.print("D");
        }else if(total<40){
            System.out.print("Fail");
        }
    }
    
}