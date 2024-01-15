package MyLambda.practice_01;

public class LambdaDemo {
    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.start();

//        匿名内部类
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程程序启动");
//            }
//        }).start();

//        Lambda
        new Thread(() -> {
            System.out.println("多线程程序启动");
        }).start();
    }
}
