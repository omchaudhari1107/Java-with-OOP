import java.util.Scanner;
public class ps_chapter3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter name");
        name=input.nextLine();
        System.out.println("To lower case: "+name.toLowerCase());       
        System.out.println("Replacing "+name.replace(" ","_"));   
        System.out.println("spaces at " +name.indexOf(" ")); 
        String letter = "Dear harry,\nThis Java Cource is nice.\nThanks";
        System.out.println(letter);
        input.close();
    }
}
