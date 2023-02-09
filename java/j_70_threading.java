class Mythread1 extends Thread {
    @Override
    public void run() { 
        int i=0;
        while (i<40000) {
            System.out.println("1");
        }
    }
}
class Mythread2 extends Thread {
    @Override
    public void run() { 
        int i=0 ;
        while (i<40000) {
            System.out.println("2");
        }

    }
}

public class j_70_threading {

    public static void main(String[] args) {
        Mythread1 m1 = new Mythread1();
        Mythread2 m2 = new Mythread2();
        m1.start();
        m2.start();
    }
}