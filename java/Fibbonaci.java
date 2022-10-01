import java.util.Scanner;
public class Fibbonaci{
 public static void main(String args[]){
  int first,second,next,n,i;
  System.out.println("Enter values of first, second and n");
  Scanner in = new Scanner(System.in);
  first = in.nextInt();
  second = in.nextInt();
  n = in.nextInt();
  next = first+second;
  for(i=3;i<=n;i++)
  {
   System.out.println(next);
   first = second;
   second = next;
   next = first + second;
  }
 }
}