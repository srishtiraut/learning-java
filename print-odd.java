//Java pgm to display odd nos from 1 to 100 using for loop first then while loop
public class Main
{
	public static void main(String[] args) {
// 		for(int i = 1; i<=100; i++){
// 		    if(i%2!=0){
// 		        System.out.print(i +" ");
// 		    }
// 		}

        int i=1;
        while(i<=100){
            if(i%2!=0){
		        System.out.print(i +" ");
		    }
		    i++;
        }
	}
}