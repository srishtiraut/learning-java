// Java pgm to accept a Character from user and check if 
// it is an alphabet or digit or special symbol
//in case of alphabet, return if it is lowercase or uppercase

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        char ch = sc.next().charAt(0);      //extract first character from the String entered by user
        
        if(ch>=97 && ch<=122){
            System.out.print(ch+" is a lowercase alphabet. ");
        }else if(ch>=65 && ch<=90){
            System.out.print(ch+" is an uppercase alphabet.");
        }else if(ch>=48 && ch<=57){
            System.out.print(ch+" is an digit. ");
        }else{
            System.out.print(ch+" is an special symbol. ");
        }
    }
}