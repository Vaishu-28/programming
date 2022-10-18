import java.io.*;
public class ExceptionEx1{
public static void main(String args[]) {
InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ir);
String s[]=new String[10];
System.out.println("Enter values");
for(int i=0;i<10;i++){
try{
 s[i] =br.readLine();
 }catch(IOException e){
  System.out.println("IO Exception");}
}
for(int i=0;i<10;i++){
System.out.println("s["+i+"] = "+s[i]);
}
}
}