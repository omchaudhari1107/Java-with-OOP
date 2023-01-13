public class j_34_Recursion {
    static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // when a function is calling itself then it is called as Recursion
        System.out.println(Factorial(5));
    }
}