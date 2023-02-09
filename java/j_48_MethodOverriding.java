class A {
    public int a;

    public int meth1() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    // making Same method in two class which is being inherit from superior then it runs own method..
    // if A is parent and B is inheited child class and if they have same name of methods then if we create an object of B and call that method which have a same name then the method is run of B.That is called methdo OverRiding.
    @Override // override notation
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}

public class j_48_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.meth2();
        b.meth2();
    }
}
