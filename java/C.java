import java.util.Scanner;

interface A{
 void print();
}
class B{
 public void display(){
  System.out.println("I am in class B");}
 }
public class C extends B implements A{
 public void display1(){
  System.out.println("I am in class B");}
 public void print(){
  System.out.println("I am in interface A");}
   public static void main(String args[]){
     C c1=new C();
     c1.display1();
     c1.display();
     c1.print();
  }
}