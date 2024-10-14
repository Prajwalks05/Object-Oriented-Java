import java.util.Scanner;
class Book
{
String name;
String author;
float price;
int num_pages;


Book(String name,String author,int price,int num_pages)
{
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}//constructor end


public String toString() //overriding the toString() method  
{
  return "Name:"+name+"\nAuthor:"+author+"\nPrice:"+price+"\nPage_no:page_nums";  
 }  


}//book class end

class Book_details
{
public static void main(String args[])
{
Book b1=new Book("book1","auth1",250,254);
Book b2=new Book("book2","auth2",310,471);
Book b3=new Book("book3","auth3",291,926);
System.out.println(b1+"\n");
System.out.println(b2+"\n");
System.out.println(b3+"\n");
}
}
