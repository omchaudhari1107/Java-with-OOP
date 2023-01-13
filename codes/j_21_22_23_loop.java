import java.util.Scanner;

public class j_21_22_23_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for fist odd's: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                continue;// it say that to skip the bellow statement of "hello" and to move next
                         // iteration(next iteration)
            }
            System.out.println("hello");
        }
        input.close();
    }
}
