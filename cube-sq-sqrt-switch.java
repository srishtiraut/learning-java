//Java pgm to accept a choice, a number and perform 
//1. cube
//2. square
//3. square root

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pick an operation of choice: 1. Cube 2. Square 3. Square root");
        
        // int choice = sc.nextInt();
        String choice = sc.next();
        float num = sc.nextFloat();
        
        switch(choice){
            default:
                System.out.println("Invalid input");
                break;
            
            //commented part also works fine
            // case 1:
            //     System.out.println("Cube of "+num+" is: "+ num*num*num);
            //     break;
            // case 2:
            //     System.out.println("Square of "+num+" is: "+ num*num);
            //     break;
            // case 3:
            //     System.out.println("Square root of "+num+" is: "+ Math.sqrt(num));
            //     break;
        
            case "cube":
                System.out.println("Cube of "+num+" is: "+ num*num*num);
                break;
            case "square":
                System.out.println("Square of "+num+" is: "+ num*num);
                break;
            case "sqrt":
                System.out.println("Square root of "+num+" is: "+ Math.sqrt(num));
                break;
        }
    }
}