package passage_10;
/*拼接古诗*/
public class practice_4 {
    public static void main(String[] args) {
        String s1 = "白日依山尽"+","+"黄河入海流"+".";
        System.out.println(s1);

        String s2 = "白日依山尽";
        s2 += ",";
        s2 += "黄河入海流";
        s2 += ".";
        System.out.println(s2);

        String str3 = "白日依山尽";
        str3 = str3.concat(",");
        str3 = str3.concat("黄河入海流");
        str3 = str3.concat(".");
        System.out.println(str3);
    }
}
