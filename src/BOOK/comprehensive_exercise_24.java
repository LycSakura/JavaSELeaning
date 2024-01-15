package BOOK;

/*计算平均分*/
public class comprehensive_exercise_24 {
    private final int id;
    private final String name;
    private final double chinsee;
    private final double math;
    private final double english;

    public comprehensive_exercise_24(int id, String name, double chinsee, double math, double english) {
        this.id = id;
        this.name = name;
        this.chinsee = chinsee;
        this.math = math;
        this.english = english;
    }

    public void show_average() {
        double average = (math + english + chinsee) / 3.0;
        System.out.println(id + "\t\t" + name + "\t\t" + chinsee + "\t\t" + math + "\t\t" + english + "\t\t" + average);
    }

    public static void main(String[] args) {
        System.out.println("学号" + "\t\t" + "姓名" + "\t\t" + "语文" + "\t\t\t" + "数学" + "\t\t\t" + "英语" + "\t\t\t" + "平均分");
        comprehensive_exercise_24 s1 = new comprehensive_exercise_24(1, "张三", 91.5, 98.0, 89.0);
        s1.show_average();
        comprehensive_exercise_24 s2 = new comprehensive_exercise_24(2, "李四", 96.0, 98.5, 93.0);
        s2.show_average();
        comprehensive_exercise_24 s3 = new comprehensive_exercise_24(3, "王五", 97.0, 100.0, 98.5);
        s3.show_average();
        comprehensive_exercise_24 s4 = new comprehensive_exercise_24(4, "钱六", 77, 83.0, 81.0);
        s4.show_average();
    }
}
