//Java pgm to print even numbers from 1 to 100 in reverse order

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		for(int i=100; i>=1; i--){
		    System.out.print(i%2==0 ? i : " ");
		}
	}
}