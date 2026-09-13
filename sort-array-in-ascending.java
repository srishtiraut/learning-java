 
 import java.util.*;

//java pgm to accept n numbers and sort them and print sorted array.
class Main {

   public static void main(String args[]){
    
    //ask for n
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers?");
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    
    System.out.println("Enter numbers one by one:");
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i]>arr[j]){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println("In sorted order:");
    for(int i=0; i<n; i++){
        System.out.println(arr[i]+" ");
    }
    
    }      
}