//Java pgm to print this pattern
//      *
//     ***
//    *****
//   *******

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      //outer loop controls rows
	      //inner loop controls pattern printing
	      
	     for(int i=1, k=1; i<=4; i++){
	         //print spaces
	         for (int j=1;j<=30-i; j++ ){
	             System.out.print(" ");
	         } 
	         //print pattern after spaces
	         for (int j=1;j<=(2*i)-1 ;j++ ){
	             System.out.print("*");
	         }
	         
	         System.out.println();
	     }
	}
}