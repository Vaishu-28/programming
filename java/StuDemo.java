import java.util.Scanner;

class Student{
 private int regno;
 private String name;
 private double cgpa;
 public void get(){
  System.out.println("Enter details : ");
  Scanner s=new Scanner(System.in);
  Scanner s1=new Scanner(System.in);
  regno = s.nextInt();
  cgpa = s.nextDouble();
  name = s1.nextLine();
 }
public void display(){
 System.out.println(name+" "+regno+" "+cgpa);
 }
public void search(){
 int regno1;
 System.out.println("Enter the regno to be searched:");
 regno1 = s.nextInt();
 for(int i=0;i<10;i++){
  if(regno1==s[i].regno){
   System.out.println("The student is present");}
  else{
   System.out.println("The student is not present");}
}

public class StuDemo1{
 public static void main(String args[]){
  Student s[] = new Student[10];
  for(int i=0;i<10;i++){
   s[i]=new Student();
   s[i].get();
  }
  for(int i=0;i<10;i++){
   s[i].display();
  }
 }
}