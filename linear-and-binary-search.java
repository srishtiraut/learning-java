import java.util.*;

//java pgm to accept n numbers and search for a value
class Main {

    static int search(int target, int[] arr, int size){
        Arrays.sort(arr);//binary search expects sorted input array
        int start = 0;
        int end = size-1;
        

        while(start<=end){
            int mid = start + (end)-start/2
        }
         return -1;

    }
    
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
    
    System.out.println("What number do you want to search for?");
    int target = sc.nextInt();
    int ans = 0;
    int i;
    //linear search
    // for (i=0; i<n ;i++ ){
    //     if(arr[i]==target){
    //         ans = i;
    //         System.out.println(target + " is at position "+ans);
    //         break;
    //     }
    // } 
    // if(i==n){
    //     ans = -1;
    //     System.out.println(target + " not found");
    // }

    //binary search
    ans = search(target, arr, n);
    if(ans == -1){
        System.out.println(target+" not found");
    }else{
        System.out.println(target+" found at position "+ans);
    }
     
}
}