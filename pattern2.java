//Java pgm to print this patter
// ****
// ***
// **
// *

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      //outer loop controls rows
	      //inner loop controls pattern printing
	      
	      for(int i=1; i<=4;i++){
	       //   System.out.println(" ");
	          for(int j=4; j>=i;j--){
	              System.out.print("* ");
	          }
	          System.out.println(" ");
	      }
	}
}