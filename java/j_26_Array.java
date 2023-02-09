
/**
 * j_26_Array
 */
import java.util.Scanner;

public class j_26_Array {
    public static void main(String[] args) {
        // creating array;
        Scanner input = new Scanner(System.in);
        int mark;
        // 1st way to declare array
        // int[] marks1 = new int[10];

        // 2nd way to declrare array
        int marks2[] = new int[10];
        System.out.println("Enter marks");
        for (int i = 0; i < marks2.length; i++) {
            mark = input.nextInt();
            marks2[i] = mark;
        }
        for (int i = 0; i < marks2.length; i++) {
            System.out.println(marks2[i]);
        }
        input.close();
    }
}