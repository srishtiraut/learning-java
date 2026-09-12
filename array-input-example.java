import java.util.*;

//java pgm to accept n values in array and find sum of only odd elements

public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter how many elements to be stored in the array");
    int n = sc.nextInt();
    
    int arr[] = new int[n]; //array created
    
    System.out.println("Enter values one by one");
    for (int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    
    //sum
    int sum = 0;
    for(int i=0; i<n; i++){
        if(arr[i]%2!=0){
            sum = sum+arr[i];
        }
    }
    
    System.out.println("Sum of odds:" + sum);
    
}