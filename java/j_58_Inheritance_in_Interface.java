interface Parent {
    void meth1();

    void meth2();
}

interface Child extends Parent {
    void meth3();

    void meth4();
}

class MySample implements Child {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}

// this the way to do inheritance for Interface.
// Interface defination must be public.
public class j_58_Inheritance_in_Interface {
    public static void main(String[] args) {
        MySample obj = new MySample();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
