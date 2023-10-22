import java.util.*;
public class StudentGrade
{
public static void main(String[] args){
 System.out.println("Enter your marks!!!!");
 Scanner sc=new Scanner(System.in);
 System.out.println("Below are given subjects : ");
 System.out.print("English = ");
 float eng = sc.nextFloat();
 System.out.print("Physics = ");
 float phy = sc.nextFloat();
 System.out.print("Chemistry = ");
 float chem = sc.nextFloat();
 System.out.print("Geography = ");
 float geo = sc.nextFloat();
 System.out.print("Algebra = ");
 float alg = sc.nextFloat();
 
 float total= eng+phy+chem+geo+alg;
 
 float average = (float)(total/5.0);
 
 float percentage = (float)((total/500.0)*100);
 
 
 System.out.println("Lets know Grade!!!!");
 
 if(average>=90)
 {
  System.out.println("Congratulations!!!! you have 'A' grade ");
  
 }
 else if(average>=80 && average<90)
 {
  System.out.println("wooow!!!! you have 'B' grade");
 }
 else if(average>=70 && average<80)
 {
  System.out.println("Good!!!! you have 'C' grade");
 }
 else if(average>=60 && average<70)
 {
  System.out.println("Its fine....you have 'D' grade");
 }
 else
  {
  System.out.println("Better luck next time....you have 'E' grade");
 }
 
 System.out.println("Lets know everything in detail : ");
 
 System.out.println("Total marks are : " +total);
 
 System.out.println("Average marks are :" +average);
 
 System.out.println("Percentage : " +percentage);
 
 }
}