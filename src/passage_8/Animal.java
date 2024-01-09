package passage_8;

/*猫吃鱼，狗吃肉*/
class Animal {
    void eat() {
    }
}

class Demo {
    public static void main(String[] args) {
        Animal maomao = new Animal() {
            void eat() {
                System.out.println("猫吃鱼，狗吃肉");
            }
        };
        maomao.eat();
    }
}
