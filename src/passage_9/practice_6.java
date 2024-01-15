package passage_9;

import java.util.Scanner;

/*价格调控*/
public class practice_6 {
    static void price(double price) throws OverMonery {
        if (price > 7) {
            throw new OverMonery("国家规定西红柿单价不能超过7元");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("今天的西红柿单价(单价格式为”3.00“):");
        try {
            float price = sc.nextFloat();
            price(price);
        } catch (OverMonery e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

class OverMonery extends Exception {
    String message;

    public OverMonery(String ErrorMessage) {
        message = ErrorMessage;
    }

    public String getMessage() {
        return message;
    }
}