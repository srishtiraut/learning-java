import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter 2 nos.");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        float d;

		System.out.println("Enter choice: 1.add 2.subtract 3.multiply 4.divide 5.remainder");

        int option = sc.nextInt();
        
        switch(option){
            default: System.out.println("Error in input");
                break;
            
            case 1:
                c = a+b;
                System.out.println("a+b="+c);
                break;
            case 2:
                c = a-b;
                System.out.println("a-b="+c);
                break;
            case 3:
                c = a*b;
                System.out.println("a*b="+c);
                break;
            case 4:
                d = ((float)a)/b;
                System.out.println("a/b="+d);
                break;
            case 5:
                c = a%b;
                System.out.println("a%b="+c);
                break;
        }
        

	}
}