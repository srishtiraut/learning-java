// Java pgm to accept a Character from user and check if 
// it is a vowel or consonant

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        char ch = sc.next().charAt(0);      //extract first character from the String entered by user
        
        if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)){
            
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ||
               ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
                System.out.print(ch+" is a VOWEL. ");
               }else{
                   System.out.print(ch+" is a consonant. ");
               }
        }else{
            System.out.print(ch+" is not an alphabet ");
        }
    } 
}