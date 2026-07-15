// Java pgm to accept a year from user and display if it is leap or not

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        
        int year = sc.nextInt();
        
        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.print(year+" : Leap year");
        }else{
           System.out.print(year+" : Not a leap year"); 
        }
    } 
}