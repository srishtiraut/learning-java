import java.util.*;

//java pgm to accept n values in array and find min and max out of the elements

public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    System.out.println("Enter elements one by one:");
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    
    //find min 
    //assume arr[0] is min
    int min = arr[0];
    int max = arr[0];
    
    for(int i=1; i<n; i++){
        if(arr[i]<min){ //if current element is smaller than min
            min = arr[i];       //update min
        }
        
        if(arr[i]>max){ //if current element is bigger than max
            max = arr[i];   //update max
        }
    }
    
    System.out.println("min:" + min);
    System.out.println("max:" + max);
}