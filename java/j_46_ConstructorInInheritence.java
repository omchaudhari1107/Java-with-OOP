class Base {
    Base() {
        System.out.println("I am base class Constructor");
    }

    Base(int a) {
        System.out.println("I am base class Constructor with a value of: " + a);
    }
}

class Derived extends Base {
    Derived() {
        // by default it run a simple constructor with no value in it
        // but if we need to run a constructor with value then we need to use super() function
        // super(12);
        System.out.println("I am a derived class constructor");
    }

    Derived(int x, int y) {
        super(x);// super means superior
        System.out.println("I am Derived class Constructor with a value of: " + y);
    }
}

class ChildOfDerived extends Derived {

    ChildOfDerived() {
        System.out.println("I am child of Derived constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am child of Derived constructor with value of: " + z);
    }
}

public class j_46_ConstructorInInheritence {
    public static void main(String[] args) {
        // Derived d = new Derived(1, 2);
        // ChildOfDerived c = new ChildOfDerived();
        ChildOfDerived c = new ChildOfDerived(1, 2, 3);
        System.out.println(c);
    }
}
