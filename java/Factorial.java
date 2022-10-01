import java.util.Scanner;
public class Leap{
 public static void main(String args[]){
  int year;
  System.out.println("Enter value of a");
  Scanner in = new Scanner(System.in);
  a = in.nextInt();
  if(year%4==0)
  {
    System.out.println("The year is leap year");
  }
  else if(year%100==0)
  {
    System.out.println("The year is not leap year");
  }
  else if(year%400==0)
  {
    System.out.println("The year is leap year");
  }
  else 
  {
    System.out.println("The year is not a leap year");
  }
 }
}