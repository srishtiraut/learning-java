//Java pgm to print this pattern
// 1
// 2 3
// 4 5 6
// 7 8 9 10
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      //outer loop controls rows
	      //inner loop controls pattern printing
	      
	     for(int i=1, k=1; i<=4; i++){
	         for(int j=1; j<=i; j++, k++){
	             System.out.print(k+" ");
	         }
	         System.out.println(" ");
	     }
	}
}