class mythr extends Thread {
    public mythr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println(i+". name: " + getName());
            i++;
        }
    }
}

public class j_75_ThreadMethods {
    public static void main(String[] args) {
        mythr t1 = new mythr("t1");
        mythr t2 = new mythr("t2");
        // mythr t3 = new mythr("t3");
        t1.start();
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        t2.start();

    }
}