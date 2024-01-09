package BOOK;

/*创建昆虫类*/
public class comprehensive_exercise_31 {
    public static void main(String[] args) {
        FLy s = new FLy(6);
        System.out.println("苍蝇有" + s.legs + "条腿");
        s.fly();
        s.reproduce();

    }
}

interface Flyable {
    void fly();
}

abstract class Insect {
    int legs;

    public Insect() {
    }

    public Insect(int legs) {
        this.legs = legs;
    }

    abstract public void reproduce();
}

class FLy extends Insect implements Flyable {

    public FLy(int legs) {
        super(legs);
    }

    @Override
    public void fly() {
        System.out.println("苍蝇可以在空中飞行");
    }

    @Override
    public void reproduce() {
        System.out.println("苍蝇的繁殖方式是产卵");
    }
}