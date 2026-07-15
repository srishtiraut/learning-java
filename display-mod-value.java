// Java pgm to accept a number and display its mod aka absolute value

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find mod value: ");
        
        float num = sc.nextFloat();
        
        if(num>=0){   //num is even
            System.out.print("Mod value of "+num+ " is: "+num);
        }else{
            // int abs = num*-1;
            // System.out.print("Mod value of "+num+ " is: "+abs);
            System.out.print("Mod value of "+num+ " is: "+(-num));
        }
    }
    
}