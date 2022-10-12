import java.io.*;
public class ExceptionEx4{
public static void main(String[] args) {
int a, b, c,d;
int x[]=new int[20];
InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ir);
try{
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a/b;
x[0]=100;
x[1]=50;
System.out.println("c = "+c);
d = x[a]/x[b];
System.out.println("d = "+d);
}catch(Exception e){
  System.out.println("Exception");}
}
}