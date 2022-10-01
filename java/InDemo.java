import java.util.Scanner;

class Shape{
 public void display(){
  System.out.println("This is a Shape");}
 }
class Rectangle extends Shape{
 public void display(){
  System.out.println("This is a rectangle");}
 }
class Circle extends Shape{
 public void display(){
  System.out.println("This is a circle");}
 }
class Square extends Rectangle{
 public void display(){
  System.out.println("Square is a Rectangle");}
 }

public class InDemo{
 public static void main(String args[]){
  Shape s = new Rectangle();
  s.display();
  Shape s1 = new Circle();
  s1.display();
  Shape s2 = new Square();
  s2.display();
  }
}
 