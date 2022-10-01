import java.util.Scanner;
public class Swap{
 public static void main(String args[]){
  int a,b,temp;
  System.out.println("Enter integer values");
  Scanner in = new Scanner(System.in);
  a = in.nextInt();
  b = in.nextInt();
  temp = b;
  b = a;
  a = temp;
  System.out.println("The swapped values are"+a+b);
 }
}