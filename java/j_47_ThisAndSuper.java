class EKclass {
    int a;

    EKclass(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

public class j_47_ThisAndSuper {
    public static void main(String[] args) {
        EKclass obj = new EKclass(5);
        System.out.println(obj.getA());
    }
}
