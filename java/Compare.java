import java.util.Scanner;
public class Compare{
 public static void main(String args[]){
  int a,b,c;
  System.out.println("Enter integer values");
  Scanner in = new Scanner(System.in);
  a = in.nextInt();
  b = in.nextInt();
  c = in.nextInt();
  if(a>b && a>c)
  {
    System.out.println("a is the largest value");
  }
  else if(b>c && b>a)
  {
    System.out.println("b is the largest value");
  }
  else if(c>a && c>b)
  {
    System.out.println("c is the largest value");
  }
  else 
  {
    System.out.println("Values are not distinct");
  }
 }
}