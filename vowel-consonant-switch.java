//Java pgm to accept a char choice and display if it is a vowel or consonant

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an alphabet: ");
        
        char choice = sc.next().charAt(0);
    
        switch(Character.toLowerCase(choice)){
                
            // Commented code works fine too
            // case 'a':
            //     System.out.println(choice + " is a vowel");
            //     break;
            // case 'e':
            //     System.out.println(choice + " is a vowel");
            //     break;
            // case 'i':
            //     System.out.println(choice + " is a vowel");
            //     break;
            // case 'o':
            //     System.out.println(choice + " is a vowel");
            //     break;
            // case 'u':
            //     System.out.println(choice + " is a vowel");
            //     break;
        
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(choice + " is a vowel");
                break;
                
                
            default: //good practice to write default case at the end
                if(Character.isLetter(choice)){
                    System.out.println(choice + " is a consonant");
                    break;
                }else{
                    System.out.println("Invalid input");
                    break;
                }
        }
    }
}