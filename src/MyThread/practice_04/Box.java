package MyThread.practice_04;

public class Box {
    private int milk;
    private boolean state = false;

    public synchronized void put(int milk) {
        //如果有牛奶等待消费
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有牛奶，就生产牛奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");
        //生产完毕，修改奶箱状态
        state = true;
        //唤醒其他等待的线程
        notifyAll();
    }

    public synchronized void get() {
        //如果没有牛奶，等待生产
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶就消费
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        //消费完毕后,修改奶箱状态
        state = false;
        //唤醒其他等待的线程
        notifyAll();
    }
}
