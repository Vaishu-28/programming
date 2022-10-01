import java.util.Scanner;

class Factorial{
 private int n;
 private int i;
 public void get(){
  System.out.println("Enter the value of n:");
  Scanner s = new Scanner(System.in);
  n = s.nextInt();
 }
 public void fact(){
  int fac=1;
  for(i=1;i<n;i++){
   fac=fac*i;
  }
  System.out.println("The factorial of n is :"+fac);
 }
}
public class FactorialDemo{
 public static void main(String args[]){
  Factorial f = new Factorial();
  f.get();
  f.fact();
 }
}