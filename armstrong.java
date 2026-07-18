//java pgm to accept a number and 
//display if it is a armstrong num or not
//a number is armstrong if the sum of the cube of its digits is the 
//number itself eg. 153 is armstrong => 1 + 125 + 27 = 153

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        double sum = 0;
        double cube = 0;
        int initial = num;
        
        
        while(num!=0){
            
            // sum = sum+(num%10);     
            
            cube = Math.pow(num%10, 3); //27 125 1
            sum = sum + cube; //0+0 0+0+27 0+0+27+125
            
            num = num/10;           //15 1 0//remove that last digit
               
        }
        if(sum == initial){
            System.out.println("yes armstrong");
        }else{
            System.out.println("not armstrong");
        }
        
    }
} 

