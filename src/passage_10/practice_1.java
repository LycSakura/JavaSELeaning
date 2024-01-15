package passage_10;

/*三种形式创建字符串*/
public class practice_1 {
    public static void main(String[] args) {
        String s1 = "要么你主宰生活，要么你被生活主宰——吉姆.罗恩";
        String s2 = new String("要么你主宰生活，要么你被生活主宰——吉姆.罗恩");
        String s3 = String.valueOf("要么你主宰生活，要么你被生活主宰——吉姆.罗恩");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
