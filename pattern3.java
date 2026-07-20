//Java pgm to print this pattern
// 1
// 1 2
// 1 2 3
// 1 2 3 4
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      //outer loop controls rows
	      //inner loop controls pattern printing
	      
	      for(int i=1; i<=4;i++){
	          for(int j=1; j<=i; j++){
	              System.out.print(j+" ");
	          }
	          System.out.println(" ");
	          
	      }
	}
}