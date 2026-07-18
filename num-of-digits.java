//java pgm to accept a number and 
//display how many digits it has

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        int input = num;
        int count = 0;
        
        while(num!=0){
            num = num/10;
            count++;
        }
        
        System.out.println(input +" has "+count+" digits.");
        
        
    }
} 