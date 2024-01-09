package passage_9;
/*数据类型转换异常*/
public class comprehensive_exercise_2 {
    public static void main(String[] args) {
        try {
            String str = "1.5";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
