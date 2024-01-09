package BOOK;

/*输出汇率表*/
public class comprehensive_exercise_02 {
    public static void main(String[] args) {
        int year = 2021, month = 3, day = 10;
        char family = '张', name = '三';
        long card = 1234567890987654321L;
        String currency = "RMB";
        double money = 1000.0;
        int Storage_serial_number = 10;
        int number = 12345;
        System.out.println("\t中国工商银行\n");
        System.out.println("------------------");
        System.out.println("日期：\t" + year + "-0" + month + "-" + day);
        System.out.println("户名：\t" + family + name);
        System.out.println("账号：\t" + card);
        System.out.println("币种：\t" + currency);
        System.out.println("存储的金额：\t" + money);
        System.out.println("存储序号：\t0" + Storage_serial_number);
        System.out.println("柜员号：\t" + number);
        System.out.println("------------------");
    }
}
