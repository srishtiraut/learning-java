// Java pgm to accept 3 numbers from user and find the greatest among them

import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers ");
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        String ans = (n1==n2 && n2==n3)?"All equals.": 
                    (n1>=n2 && n1 >=n3) ? n1+" is greater" :
                    (n2>=n1 && n2 >=n3) ? n2+" is greater" :
                    n3+" is greater";
        
        System.out.println(ans);
        
    }
}