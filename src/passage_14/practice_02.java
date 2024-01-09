package passage_14;

/*小动物吃东西*/
public class practice_02 {
    public static void main(String[] args) {
        Eatable dog = () -> System.out.println("小狗爱吃骨头");
        Eatable cat = () -> System.out.println("小猫爱吃鱼");
        Eatable chichen = () -> System.out.println("小鸡爱吃猫猫虫");
        dog.eat();
        cat.eat();
        chichen.eat();
    }
}

interface Eatable {
    void eat();
}
