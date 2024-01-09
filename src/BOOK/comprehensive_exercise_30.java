package BOOK;

/*创建猫类*/
public class comprehensive_exercise_30 {
    public static void main(String[] args) {
        Cat s1 = new Cat("java", 12, 21.0, "java.awt.Color[r=0,g=0,b=0]");
        System.out.println("猫咪一号:" + s1 + "\n");
        Cat s2 = new Cat("C++", 12, 21.0, "java.awt.Color[r=255,g=255,b=255]");
        System.out.println("猫咪二号:" + s2 + "\n");
        Cat s3 = new Cat("java", 12, 21.0, "java.awt.Color[r=0,g=0,b=0]");
        System.out.println("猫咪三号:" + s3 + "\n");

    }
}

class Cat {
    String name;
    int age;
    double weight;
    String color;

    public Cat(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "名字:" + name + "\n" +
                "年龄:" + age + "\n" +
                "重量:" + weight + "\n" +
                "颜色:" + color + "\n";
    }
}
