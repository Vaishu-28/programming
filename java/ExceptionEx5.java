import java.io.*;
public class ExceptionEx5 {
public void TestException() throws Exception{
 int a, b, c,d;
int x[]=new int[20];
InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ir);
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
a=10;
b=5;
c=a/b;
x[0]=100;
x[1]=50;
System.out.println("c = "+c);
d = x[a]/x[b];
System.out.println("d = "+d);
}
public static void main(String[] args){
   ExceptionEx5 t=new ExceptionEx5();
   try{
     t.TestException();
   }catch(Exception e){
    System.out.println("Exception");} 

}
}