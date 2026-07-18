//java pgm to accept start and end number and 
//find sum of even numbers lying between them

import java.util.*;
import java.math.BigInteger;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt(); 
        int end = sc.nextInt();
        int sum = 0;
        while(start<=end){
            if(start%2==0){
                sum = sum+start;
            }
            start++;
        }
        
        System.out.println(sum);
        
    }
}

