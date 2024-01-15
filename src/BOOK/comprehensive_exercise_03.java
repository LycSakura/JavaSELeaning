package BOOK;

/*输出个人信息*/
public class comprehensive_exercise_03 {
    public static void main(String[] args) {
        char family = '李';
        String names = "llyina";
        char name = '四';
        char sex = '男';
        int age = 25;
        double height = 1.76;
        double weight = 65.5;
        boolean marryStatus = false;
        System.out.println("\t个人信息");
        System.out.println("-------------------------");
        System.out.println("姓名\t" + family + name);
        System.out.println("性别\t" + sex);
        System.out.println("年龄\t" + age);
        System.out.println("身高\t" + height + "米");
        System.out.println("体重\t" + weight + "体重");
        System.out.println("是否已婚\t" + marryStatus);
    }
}
