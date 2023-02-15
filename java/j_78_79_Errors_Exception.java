import java.util.*;

public class j_78_79_Errors_Exception {
    public static void main(String[] args) {
        // int a = 5;//Synatax error if no semicolon
        // System.out.println(a);

        // for (int i = 1; i < 5; i++) {
        // System.out.println(2*i+1);
        // }//its an logical error because it print 9 in prime numbers

        // we can only be able to solve the runtime error

        // RUNTIME ERROR
        int k;
        Scanner inp = new Scanner(System.in);
        k = inp.nextInt();
        System.out.println("Integer part of 1000 divided by " + k + " is " + (1000 / k));
        inp.close();

    }
}
