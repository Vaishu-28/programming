interface A{
 void meth1();
 void meth2();
 }
public class Myclass3 implements A{
 public void meth1(){
  System.out.println("I am in method 1");}
 public void meth2(){
  System.out.println("I am in method 2");}
 public static void main(String args[]){
  Myclass3 a=new Myclass3();
  a.meth1();
  a.meth2();
}
}