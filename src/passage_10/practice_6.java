package passage_10;

/*如何获取中间字符*/
public class practice_6 {
    public static void main(String[] args) {
        String str = "我爱Java";
        char ch = getMidIndex(str);
        System.out.println(ch);
    }

    public static char getMidIndex(String str) {
        int i, j;
        for (i = 0, j = str.length() - 1; i <= j; i++, j--) {
            if (i == j) {
                return str.charAt(i);
            }
        }
        return str.charAt(j);
    }
}
