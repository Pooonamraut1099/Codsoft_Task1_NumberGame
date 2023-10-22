import java.util.Random; 
import java.util.*;

public class GuessNumber{

 public static void main(String[] args){
 
 Random rand = new Random();
 
 int RandomNumber = rand.nextInt(100) + 1;
 
 while(true){
	 System.out.println("heyyy plz enter your guess number between 1 to 100 : "); 

	 Scanner scan=new Scanner(System.in);
	 
	 int Guess=scan.nextInt();
	 
	 if(Guess == RandomNumber){
	   System.out.println("woooow Your guess in correct !!!!");
	    break;

	 }
	 else if(RandomNumber > Guess){
	  System.out.println("Nope! The number is higher.... Guess again");
	 }
	 else{
	 System.out.println("Nope! The number is lower....Guess again");
	 }
	}
 

 
 }
 }
  