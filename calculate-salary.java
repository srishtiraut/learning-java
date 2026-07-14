//Java pgm to accept a basic salary and find 
//1. gross salary
//2. net salary

import java.util.*;

class Main{
    public static void main(String args[]){
        
        final double pf = 2000;
        
        System.out.println("Enter basic salary: ");
        Scanner sc = new Scanner(System.in);
        
        
        double basic = sc.nextInt();
        
        double da = 0.1*basic;
        double hra = 0.25*basic;
        
        double net = basic+hra+da;
        double gross = net + pf;
        System.out.println("gross: "+gross);
        System.out.println("net: " +net);
        
    }
}