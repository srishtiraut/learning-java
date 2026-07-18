//java pgm to accept a number and 
//display the sum of its digits

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        int input = num;
        int sum = 0;
        
        
        while(num!=0){
            
            sum = sum+(num%10);     //extract last digit of num
            num = num/10;           //remove that last digit
               
        }
        
        System.out.println(sum);
    }
} 

