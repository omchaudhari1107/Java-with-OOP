
class mythr1 extends Thread {
    public mythr1(String name) {
        super(name);
    }

    public void run() {
        // System.out.println("i am athread");
    }
}

class mythr2 implements Runnable {
    public mythr2(String name) {
        // super(name);
    }

    public void run() {
        // System.out.println("i am a thread of runnable");
    }
}

public class j_73_ThreadClass {
    public static void main(String[] args) {
        mythr1 m = new mythr1("thread1");
        m.start();
        System.out.println("Id of thread is " + m.threadId());
        System.out.println("name of thread is " + m.getName());
        // use threadid() insted of getId() to get the id of the thread

        mythr2 m1 = new mythr2("thread2");
        Thread t = new Thread(m1);
        System.out.println("id of thread is " + t.threadId());
        System.out.println("name of thread is " + t.getName());
        t.start();
    }
}