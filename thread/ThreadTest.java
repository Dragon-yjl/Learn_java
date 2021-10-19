package thread;

public class ThreadTest {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i < 10;i++) {
                    System.out.println(i + ":" + Thread.interrupted());
                }
            }
        });
        t.start();//线程启动，中断标志位=false
        System.out.println("t start");
        //告诉t线程，要中断（设置t线程的中断标志位为true）
        t.interrupt();

        System.out.println("t stop");


    }
}
