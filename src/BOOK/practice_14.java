package BOOK;

/*剧院售票*/
public class practice_14 {
    public static void main(String[] args) {
        System.out.println("售票模拟");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 1 || j == 10) {
                    continue;
                }
                System.out.println("第" + i + "行，第" + j + "列");
            }
        }
    }
}
