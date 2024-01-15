package BOOK;

/*汽车厂，鞋厂，都是工厂*/
public class practice_47 {
    public static void main(String[] args) {
        Factory car = new AutoPlant();
        car.produce();
        Factory shose = new ShoseFactory();
        shose.produce();
    }
}

class AutoPlant extends Factory {
    @Override
    public void produce() {
        System.out.println("汽车厂生产汽车");
    }
}

class ShoseFactory extends Factory {
    @Override
    public void produce() {
        System.out.println("鞋厂生产鞋");
    }
}

abstract class Factory {
    abstract public void produce();

}