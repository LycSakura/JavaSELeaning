package passage_10;

/*判断某文字只出现一次*/
public class practice_5 {
    public static void main(String[] args) {
        practice_5 s = new practice_5();
        String original = "我爱jiava，但是更爱python";
        String substr = "爱";
        if (s.check(original, substr)) {
            System.out.println("某段文字在指定字符中只出现一次");
        } else {
            System.out.println("某段文字在指定字符中不只出现一次");
        }
    }

    public boolean check(String original, String substr) {
        return original.indexOf(substr) == original.lastIndexOf(substr);
    }
}
