package geekbrains.j2lesson5;

public class Main {

    public static void main(String[] args)  {
       Thread m1 = new Thread(new MyRunnable1());
        Thread m2 = new Thread(new MyRunnable2());

       m1.start();
       m2.start();

        try {
            m2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
