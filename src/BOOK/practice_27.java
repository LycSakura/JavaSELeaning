package BOOK;

/*信用卡消费记录*/
public class practice_27 {
    double amount;
    public static int times = 0;

    public practice_27(double amount) {
        times++;
        this.amount = amount;
    }

    public void output() {
        System.out.println("你有一大笔金额消费，交易金额" + amount + "元");
    }

    public static void main(String[] args) {
        practice_27 cr = new practice_27(1550);
        cr.output();
        practice_27 ce = new practice_27(1920);
        ce.output();
        practice_27 cd = new practice_27(1979);
        cd.output();
        practice_27 ci = new practice_27(2259);
        ci.output();
        practice_27 ct = new practice_27(1835);
        ct.output();
        practice_27 cc = new practice_27(1799);
        cc.output();
        practice_27 ca = new practice_27(2688);
        ca.output();
        System.out.println("您最近有" + practice_27.times + "笔交易");
    }
}
