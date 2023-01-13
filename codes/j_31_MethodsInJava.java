public class j_31_MethodsInJava {
    // methords means in java is function
    static int hello(int a) {
        int c = 5;
        return c;
    }

    static int hello(int a, int b) {
        int c = 10;
        return c;
    }

    public static void main(String[] args) {
        int num2 = hello(5, 6);
        int num1 = hello(5);
        System.out.println(num1);
        System.out.println(num2);
    }
}
