
import java.util.Scanner;

class Book {

    String name;
    String author;
    float price;
    int num_pages;

    Book(String name, String author, float price, int num_pages) {
        super();
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }//constructor end

    public String toString() //overriding the toString() method  
    {
        return "Name:" + name + "\nAuthor:" + author + "\nPrice:" + price + "\nPage_no:"+num_pages;
    }
}//book class end

class Book_details {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of book: ");
        int n = sc.nextInt();

        Book b1[] = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book" + (i + 1));
            System.out.println("Enter Title:");
            String name = sc.next();
            System.out.println("Enter Author:");
            String author = sc.next();
            System.out.println("Enter Price:");
            float price = sc.nextFloat();
            System.out.println("Enter Page number:");
            int num_pages = sc.nextInt();
            b1[i] = new Book(name, author, price, num_pages);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\n\n"+b1[i].toString());

        }
    }
}
