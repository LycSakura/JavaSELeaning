package passage_10;

/*常规转换符*/
public class practice_10 {
    public static void main(String[] args) {
        String name = "玩家一";
        int num = 5;
        String str = "已超神";
        String strFormat = "%s连续完成%d次击杀后，获得了'%s'的称号";
        System.out.printf(strFormat, name, num, str);
    }
}
