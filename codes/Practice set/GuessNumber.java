import java.lang.Math;
import java.util.Scanner;

class Genrator {
    private int number;

    public int Genrating() {
        number = (int) (Math.random() * 100);
        return number;
    }
}

public class GuessNumber {
    public static void main(String[] args) {
        int num, random_num, count = 0;
        Scanner input = new Scanner(System.in);

        Genrator g = new Genrator();
        random_num = g.Genrating();
        // System.out.println(random_num);

        for (int i = 0; i < 100; i++) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num == random_num) {
                System.out.println("You win");
                break;
            } else if (num > random_num) {
                System.out.println("Entered number is greater than a random one");
                count++;
            } else if (num < random_num) {
                System.out.println("Entered number is Smaller than a random one");
                count++;
            }
        }
        int diff = 100 - count;
        System.out.println("Your Score is " + diff);
        input.close();
    }
}
