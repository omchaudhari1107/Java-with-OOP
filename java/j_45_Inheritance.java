/*class Base {
    int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    Base() {
        System.out.println("I am a constructor of Base and extend by derived using inheritance");
    }
}

class Derived extends Base {
    int y;

    public int GetSet(int y) {
        this.y = y;
        return y;
    }
}*/
class Animals {
    String weight_of_dog = "20kg";
    String weight_of_cat = "10kg";
    String weight_of_lion = "40kg";

    public void dog() {
        System.out.println("hello i am Dog");
    }

    public void cat() {
        System.out.println("hello i am cat");
    }

    public void lion() {
        System.out.println("hello i am lion");
    }
}

class Dog extends Animals {
    Dog() {
        System.out.println("People loves me too much and my weight is " + weight_of_dog);
    }

}

public class j_45_Inheritance {
    public static void main(String[] args) {

        // Derived E1 = new Derived();
        // E1.setx(10);
        // System.out.println("Value of x get by making Derived class object with
        // inheitance: " + E1.getx());
        Dog a1 = new Dog();
        a1.dog();
    }
}
