import java.util.Scanner;

class Outer{
 public void display(){
  System.out.println("I am in class Outer");
 }
  class Inner{
   public void display(){
    System.out.println("I am in class Inner");}
  }
}

public class Demo1{
 public static void main(String args[]){
  Outer a=new Outer();
  Outer.Inner b=new Outer().new Inner();
  a.display();
  b.display();
 } 
}