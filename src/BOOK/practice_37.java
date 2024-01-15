package BOOK;
/*模拟轿车驾驶*/
public class practice_37 {
    public static void main(String[] args) {
        AutoCar s = new AutoCar();
        System.out.println("自动挡驾驶方式");
        s.gas();
        s.broke();
    }
}

class Car {
    public void gas() {
        System.out.println("汽车加速");
    }

    public void broke() {
        System.out.println("汽车减速");
    }

}

class AutoCar extends Car {
    @Override
    public void gas() {
        System.out.println("踩油门加速");
    }

    @Override
    public void broke() {
        System.out.println("踩刹车减速");
    }
}

class HandCar extends Car {
    @Override
    public void gas() {
        System.out.println("踩离合换挡加速");
    }

    @Override
    public void broke() {
        System.out.println("踩离合和刹车减速");
    }

    public void clucoth() {
        System.out.println("踩离合换挡");
    }

}


