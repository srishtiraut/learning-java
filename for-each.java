import java.util.*;

//java pgm to display array elements using for-each loop

public static void main(String args[]){
    
    int arr[] = {10,4,6,8,9};   //array with said 5 elements created explicitly

    System.out.println("ELements in the array are:");
    for (int ele : arr ){
        System.out.print(ele + " ");
    } 
    
}