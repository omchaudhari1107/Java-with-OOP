class mythr1 extends Thread {
    public mythr1(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            System.out.println("name: " + this.getName());
        }
    }
}

public class j_74_ThreadPriorities {
    public static void main(String[] args) {
        // ready queues: T1 T2 T3 T4 T5
        // java.lang.Thread.MIN_PRIORITY = 1
        // java.lang.Thread.NORM_PRIORITY = 5
        // java.lang.Thread.MAX_PRIORITY = 10
        mythr1 t1 = new mythr1("T1");
        mythr1 t2 = new mythr1("T2");
        mythr1 t3 = new mythr1("T3");
        mythr1 t4 = new mythr1("T4");
        mythr1 t5 = new mythr1("T5 (most IMP thread)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
