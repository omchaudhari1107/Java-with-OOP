class Circle {
    float r,aoc;

    Circle() {
    }

    Circle(int r) {
        this.r = r;
    }

    public float Area() {
        float temp = 2 * 3.14f * r * r;
        aoc = temp;
        return temp;
    }
}

class cylinder extends Circle {
    float h;

    cylinder(float h) {
        this.h = h;
    }

    // 2πrh+2πr^2
    @Override
    public float Area() {
        float temp = aoc + 2 * 3.14f * r * h;
        return temp;

    }
}

public class ps_chapter10 {
    public static void main(String[] args) {
        Circle obj1=new Circle(12);
        float Ar1 = obj1.Area();
        System.out.println("Area of Circle: " + Ar1);


        Circle obj2=new cylinder(2);
        float Ar2 = obj2.Area();
        System.out.println("Area of cylinder: " + Ar2);

    }
}
