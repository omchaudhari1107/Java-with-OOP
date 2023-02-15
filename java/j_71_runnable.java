class MythreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("i am a thread 1 not a threat");
            i++;
        }
    }
}

class MythreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("i am a thread 2 not a threat");
            i++;
        }
    }
}

public class j_71_runnable {
    public static void main(String[] args) {
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread gun1 = new Thread(bullet1);// it is just a runnable which run a thread whic is being created by us.

        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
