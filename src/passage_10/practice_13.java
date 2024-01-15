package passage_10;

import java.util.Scanner;

/*给字符串加标点*/
public class practice_13 {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("熊出没小心");
        System.out.println("更改前" + sbd.toString());
        System.out.println("输入要插入的位置");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        sbd.insert(position, "，");
        System.out.println("更改后\n" + sbd.toString());
        sc.close();
    }
}
