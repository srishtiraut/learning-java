// Java pgm to accept a number from user and display if it is even or odd. 
//Use ternary operator

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int num = sc.nextInt();
        
        String ans = num%2==0 ? "even" : "odd";
        
        System.out.println(ans);
        
    }
}