// Java pgm to accept a number and check if it is even or odd

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        
        int num = sc.nextInt();
        
        if(num%2==0){   //num is even
            System.out.print(num+" is even.");
        }else{
            System.out.print(num+" is odd.");
        }
    }
    
}