import java.util.Scanner;
class Book{
 private int bookID;
 private String title;
 private String author;
 private int price;
 public void getdata()
 {
   System.out.println("Enter the book ID, title, author and price");
   Scanner s=new Scanner(System.in);
   bookID = s.nextInt();
   title = s.nextLine();
   author = s.nextLine();
   price = s.nextInt();
 }
 public void printdata()
 {
   System.out.println("The data of the book is\n");
   System.out.println("BookID : "+bookID+"\nTitle : "+title+"\nAuthor : "+author+"\nPrice : "+price);
 }
}

public class BookDemo{
 public static void main(String args[]){
  Book b=new Book();
  b.getdata();
  b.printdata();
 }
}