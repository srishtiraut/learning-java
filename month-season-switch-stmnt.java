//Java pgm to accept a number between 1 and 12 and display 
//1. month
//2. season

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 12");
        
        int num = sc.nextInt();
        
        switch(num){
            default:
                System.out.println("Invalid input");
                break;
            
            case 1:
                System.out.println("Jan, winter");
                break;
            case 2:
                System.out.println("Feb, spring");
                break;
            case 3:
                System.out.println("Mar, summer");
                break;
            case 4:
                System.out.println("Apr, summer");
                break;
            case 5:
                System.out.println("May, summer");
                break;
            case 6:
                System.out.println("Jun, summer");
                break;
            case 7:
                System.out.println("July, rainy");
                break;
            case 8:
                System.out.println("Aug, rainy");
                break;
            case 9:
                System.out.println("Sept, rainy");
                break;
            case 10:
                System.out.println("Oct, winter");
                break;
            case 11:
                System.out.println("Nov, winter");
                break;
            case 12:
                System.out.println("Dec, winter");
                break;
        }
    }
}