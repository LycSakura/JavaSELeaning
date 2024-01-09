package BOOK;

/*购买电影票*/
public class comprehensive_exercise_23 {
    private final String name;
    private final int age;

    public comprehensive_exercise_23(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void buyTicket() {
        if (this.age >= 18) {
            System.out.println(name + "\t\t" + age + "\t\t" + 40);
        } else {
            System.out.println(name + "\t\t" + age + "\t\t" + 40 / 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("姓名" + "\t\t" + "年龄" + "\t\t" + "票价(元)");
        System.out.println("-----------------------------");
        comprehensive_exercise_23 s1 = new comprehensive_exercise_23("李明", 20);
        s1.buyTicket();
        comprehensive_exercise_23 s2 = new comprehensive_exercise_23("钱丽", 16);
        s2.buyTicket();
        comprehensive_exercise_23 s3 = new comprehensive_exercise_23("周刚", 8);
        s3.buyTicket();
        comprehensive_exercise_23 s4 = new comprehensive_exercise_23("吴红", 32);
        s4.buyTicket();
    }
}
