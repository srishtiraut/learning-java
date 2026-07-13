//Java pgm to accept a number and find its last digit

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        
        int a = sc.nextInt();
        
        int rem = a%10;
        
        System.out.println("Last digit of " + a + " is " + rem);
    }
}