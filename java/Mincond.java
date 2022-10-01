import java.util.Scanner;
public class Factorial{
 public static void main(String args[]){
  int a,fact=1,i;
  System.out.println("Enter values of a and b");
  Scanner in = new Scanner(System.in);
  a = in.nextInt();
  for(i=0;i<a;i++)
  {
    fact=fact*i;
  }
  System.out.println("The factorial of number is: "+fact);
 }
}