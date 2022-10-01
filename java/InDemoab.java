import java.util.Scanner;

class Shape{
 protected int dim1;
 protected int dim2;
 Shape(){
  dim1=dim2=0;}
 Shape(int dim1, int dim2){
  this.dim1=dim1;
  this.dim2=dim2;}
 abstract public void area();
 }
class Rectangle extends Shape{
 Rectangle(){}
 Rectangle(int dim1,int dim2){
  super(dim1);
  super(dim2);
 }
 public void area(){
  int a;
  a=dim1*dim2;
  System.out.println("The area of rectangle is :"+a);}
 }
class Circle extends Shape{
 Circle(){}
 Circle(int dim1){
  super(dim1);
  super(dim2); 
 }
 public void area(){
  int b;
  b=3.14*dim1*dim1;
  System.out.println("The area of circle is :"+b);}
 }
class Square extends Rectangle{
 public void area(){
  System.out.println("Square is a Rectangle");}
 }

public class InDemoarea{
 public static void main(String args[]){
  Shape s = new Rectangle();
  s.area();
  Shape s1 = new Circle();
  s1.area();
  Shape s2 = new Square();
  s2.area();
  }
}
 