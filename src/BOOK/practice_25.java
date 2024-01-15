package BOOK;

/*买可乐*/
public class practice_25 {
    public static void main(String[] args) {
        practice_25 s = new practice_25();
        System.out.println("商家默认冰块:" + s.ice + "个");
        practice_25 s1 = new practice_25(3);
        System.out.println("张三加的冰块:" + s1.ice + "个");
    }
    int ice;
    public practice_25() {
        this(0);
    }
    public practice_25(int ice) {
        this.ice = ice;
    }
}
