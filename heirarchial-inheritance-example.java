/*
write java program for heirarchial inheritance

            Player

CricketPlayer   HockeyPlayer
*/

import java.util.*;

class Player{
    private String pname;
    private int page, nmatches;
    
    Scanner sc = new Scanner(System.in);
    
    public Player(){    //contructor created to populate data members
        System.out.println("Enter pname");
        pname = sc.nextLine();
        
        System.out.println("Enter player's age");
        page = sc.nextInt();
        
        System.out.println("Enter no. of matches");
        nmatches = sc.nextInt();
    }
    
    public void display(){
        System.out.println("Player's name is: "+pname);
        System.out.println("Player's age is: "+page);
        System.out.println("Player has played "+nmatches+ " matches.");
    }
}

class CricketPlayer extends Player{
    private int runs, wickets;
    
    public CricketPlayer(){
        
        super();
        
        System.out.println("Enter runs: ");
        runs = sc.nextInt();
        
        System.out.println("Enter wickets");
        wickets = sc.nextInt();
    }
    
    public void display(){
        
        super.display();
        
        System.out.println("This player is a cricketer.");
        System.out.println("Runs made: "+ runs);
        System.out.println("Wickets taken: "+ wickets);
    }
}

class HockeyPlayer extends Player{
    private int goals;
    
    public HockeyPlayer(){
        
        super();
        
        System.out.println("Enter no. of goals: ");
        goals = sc.nextInt();
        
    }
    
    public void display(){
        
        super.display();
        
        System.out.println("This player is a hockey star.");
        System.out.println("Goals made: "+ goals);
    }
}


public class Main
{
	public static void main(String[] args) {
	   
	   //menu driven program
	   
	   int choice;
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter choice...1. Cricket player     2. Hockey player"); 
	   choice = sc.nextInt();
	   
	   switch(choice){
	       case 1: CricketPlayer c1 = new CricketPlayer();
	               c1.display();
	                
	               break;
	           
	       case 2: HockeyPlayer h1 = new HockeyPlayer();
	               h1.display();
	                
	               break;
	           
	       default: System.out.println("Invalid choice");
	                break;
	   }
	}
}