package addfac;
class adding {
    private int sum = 0;

    public void addition(int... arr) {
        for (int x : arr) {
            sum = sum + x;
        }
        System.out.println("addition is:" + sum);
    }
}

class factorial{
    private int mul = 1;

    public void multiplication(int... arr) {
        for (int x : arr) {
            mul = mul * x;
        }
        System.out.println("multiplication is:" + mul);
    }
}

public class createpack {
    public static void main(String[] args) {
        adding a= new adding();
        factorial f = new factorial();
    }
}
