public class j_32_Overloading {
    static void Area(int a) {
        System.out.println("Area of square is " + a * a);
    }

    static void Area(int a, int b) {
        System.out.println("Area of Rectangle is " + a * b);
    }

    static void Area(int l, int b, int h) {
        System.out.println("Area of Cube is " + l * b * h);
    }

    public static void main(String[] args) {
        Area(1, 2);
        Area(1);
        Area(1, 2, 3);

    }
}
