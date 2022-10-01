import java.util.Scanner;
public class Areaswitch{
 public static void main(String args[]){
  int r,b,h,x;
  double area;
  System.out.println("Enter values of radius,breadth and height");
  Scanner in = new Scanner(System.in);
  r = in.nextInt();
  b = in.nextInt();
  h = in.nextInt();
  System.out.println("Enter the number according to the area you want to find\n 1.Circle\n 2.Triangle\n 3.Rectangle");
  x = in.nextInt();
  switch(x){
    case 1:
     area = 3.14*r*r;
     System.out.println("the area of circle is "+area);
     break;
   case 2:
     area = 0.5*b*h;
     System.out.println("the area of triangle is "+area);
     break;
  case 3:
     area = b*h;
     System.out.println("the area of rectangle is "+area);
     break;
  }
 }
}