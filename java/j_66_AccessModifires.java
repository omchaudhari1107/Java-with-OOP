class c1 {
    public int x = 5;
    protected int y = 10;
    int z = 15;
    private int a = 0;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class c2 extends c1 {

}

class c3 {

}

public class j_66_AccessModifires {
    public static void main(String[] args) {
        // c1 c = new c1();
        c2 c = new c2();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}
