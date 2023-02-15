public class j_80_Try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }
}