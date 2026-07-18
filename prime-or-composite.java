//java pgm to accept a number and 
//display if it is prime or composite

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        
        int count = 0;  //count of factors of num
        
        if(num==1){
            System.out.println("1 is neither prime nor composite");
        }else{
            int i=1;
            
            while(i<=num){
                if(num%i==0){
                    //means i is a factor of num
                    count++;
                }
                i++;
            }
        
            if(count==2){
                System.out.println("Prime");
            }else{
                System.out.println("Composite");
            }
        }
        
        
    }
} 

