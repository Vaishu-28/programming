import java.util.Scanner;
class Point{
 private int x;
 private int y;
 Point(){
  x=y=0;
 }
 Point(int px,int py){
 x=px;
 y=py;
 }
 public void getvalues(){
  System.out.println("Enter the values for x1 and y1");
  Scanner s=new Scanner(System.in);
  int x1 = s.nextInt();
  int y1 = s.nextInt();
 }
 public void finddis(){
 int x1,y1;
 int sum = ((x1-x)*(x1-x))+((y1-y)*(y1-y));
 double ans = Math.sqrt(sum);
 System.out.println("The distance is : "+ans);
 }
}
public class PointDemo{
 public static void main(String args[]){
  Point p1 = new Point(10,20);
  Point p2 = new Point();
  p2.getvalues();
  p2.finddis();
 }
}