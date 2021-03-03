package geekbrains.j2lesson5;

public class MyRunnable1 implements Runnable {
    static final int size = 10000000;
    static final int h = size / 2;

    public void run() {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++){
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения первого метода - " + (System.currentTimeMillis() - a));
    }
}
