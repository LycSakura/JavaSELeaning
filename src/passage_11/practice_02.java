package passage_11;

/*判断字符是数字还是字母*/
public class practice_02 {
    public static void main(String[] args) {
        String str = "JDK 11.0.1";
        char[] cs = str.toCharArray();
        for (char c : cs) {
            if (Character.isDigit(c)) {
                System.out.println(c + "是数字");
            } else if (Character.isLetter(c)) {
                System.out.println(c + "是字母");
            } else {
                System.out.println(c + "既不是数字也不是字母");
            }
        }
    }
}
