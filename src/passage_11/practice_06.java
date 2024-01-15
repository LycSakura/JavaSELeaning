package passage_11;

/*比对执行效率*/
public class practice_06 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = null;
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("第一次循环用时:" + (end - start) + "毫秒");
        for (int i = 0; i < 10000; i++) {
            str.concat("a");
        }
        long last = System.currentTimeMillis();
        System.out.println("第二次循环用时:" + (last - end) + "毫秒");
    }
}
