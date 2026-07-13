//Java pgm to accept 2 nums and find power of one raised to the other

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 2 numbers: ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        double c = Math.pow(a, b);
        
        System.out.println(a+" raised to "+b+ " is " + c);
    }
}