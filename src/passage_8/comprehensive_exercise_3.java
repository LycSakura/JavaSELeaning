package passage_8;

/*吃水果*/
public class comprehensive_exercise_3 {
    public static void main(String[] args) {
        Man tom = new Man();
        tom.eat(new Fruit() {
            @Override
            String getname() {
                return "苹果";
            }
        });
        tom.eat(new Fruit() {
            @Override
            String getname() {
                return "香蕉";
            }
        });
    }
}

abstract class Fruit {
    abstract String getname();
}

class Man {
    void eat(Fruit s) {
        System.out.println("吃了" + s.getname());
    }
}
