import java.util.Scanner;
class Libreay{
    Scanner input = new Scanner(System.in);
    int count=0;
    String[] Books= new String[100];
    int[] Date = new int[100];
    public void addBook(){
        System.out.print("Enter the name of Book: ");
        Books[count] = input.nextLine();
        count++;
        System.out.println("Book Added...");
        issueBook();
    }
    public void issueBook(){
        System.out.print("Enter the date you Issuedthe book: ");
        Date[count]=input.nextInt();
        count++;
        System.out.println("Date Added...");
        returnBook();
    }
    public void returnBook(){
        int ret  = Date[count]+30;
        System.out.println("Return Date of your book "+ Books[count] +" is "+ ret);
        count++;
    }
    public void showAvailableBook(){
        System.out.println("Available Books is: ");
        for (int i = 0; i < Books.length; i++) {
            System.out.println(Books[i]);
        }
    }
}
public class j_51_Exercise {
    public static void main(String[] args) {
        Libreay b1 = new Libreay();
        // Libreay b2 = new Libreay();
        b1.addBook();
        b1.showAvailableBook();
        

    
       

    }    
}
