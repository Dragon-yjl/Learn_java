package thread_1021;

public class SynchronizedTest {

    private static int COUNT;

    public  static  void increment() {
        COUNT++;
    }

    public static void main(String[] args) {

        //以下两段代码可以并发并行执行，因为不是对对象加锁
        new Thread(new Runnable() {
            @Override
            public void run() {
                //不会产生同步互斥
                synchronized (SynchronizedTest.class) {
                    increment();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        }).start();
    }
}
