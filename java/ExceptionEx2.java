import java.io.*;
public class ExceptionEx2{
public static void main(String args[]) {
try{
String s=null;
System.out.println("length of s is "+s.length());
}catch(NullPointerException e){
  System.out.println("String can't be null");}
System.out.println("Thank you");
}
}