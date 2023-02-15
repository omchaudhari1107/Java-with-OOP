//it is a class temeplate
interface Bicycle {
    void applyBreak(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle {
    int speed = 10;

    @Override
    public void applyBreak(int decrement) {
        speed -= decrement;
        System.out.println("Speed after decrement: " + speed);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speed after increment: " + speed);
    }

    public void Horn() {
        System.out.println("Horning...");
    }
}

public class j_55_AbstractClassVSInterface {
    public static void main(String[] args) {
        System.out.println("using dynamic method dispatch");
        Bicycle b1 = new AvonCycle();
        b1.applyBreak(5);
        b1.speedUp(10);
        System.out.println("without using dynamic method dispatch");
        AvonCycle c = new AvonCycle();
        c.applyBreak(2);
        c.speedUp(3);
        c.Horn();
        //the property of interface "can not mutable" but can create new property.
    }
}
