import java.util.Scanner;
public class Oeif{
 public static void main(String args[]){
  int a;
  System.out.println("Enter integer value");
  Scanner in = new Scanner(System.in);
  a = in.nextInt();
  if(a%2==0)
  {
    System.out.println("The value is even");
  }
  else
  {
    System.out.println("The value is odd");
  }
 }
}