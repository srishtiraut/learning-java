//Java pgm to accept n from user and print the first n terms of the fibonacci series
// 0 1 0+1=1 1+1=2 1+2=3 3+2=5....

import java.util.*;

class Main{
    public static void main (String[] args) {
    /* code */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    if(n<2){
        System.out.println("Input should be 2 or more");
    }else{
        int first=0, second=1, third=0; 
        
        //print the first 2 terms, that is 0 and 1
        System.out.print(first+" "+second+" ");
        
        //print the terms after the first 2 terms
        for(int i=1; i<=n-2; i++){
            third = first+second;
            System.out.print(third+" ");
            
            //first and second should now change values
            first = second;
            second = third;
        }
        
        // System.out.print(third+" ");     //if they asked to print the nth term of the Fibonacci series
    }
}

}