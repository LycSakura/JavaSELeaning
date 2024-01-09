package BOOK;

import java.util.Objects;
import java.util.Scanner;

/*设置信用卡密码*/
public class practice_26 {
    String cardNum;
    String password;

    public practice_26(String cardNum, String password) {
        this.cardNum = cardNum;
        this.password = password;
        if (password.equals("123456")) {
            System.out.println("卡号：" + cardNum + "默认密码：" + password);
        } else {
            System.out.println("卡号" + cardNum + "你设的密码：" + password);
        }
    }

    public practice_26(String cardNum) {
        this(cardNum, "123456");
    }

    public static void main(String[] args) {
        practice_26 initialCredit = new practice_26("4013735633800642");
        practice_26 resetedCredit = new practice_26("4013735633800642", "168779");
    }
}
