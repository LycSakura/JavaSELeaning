package passage_10;
/*判断数字共有几位*/
public class comprehensive_exercise_1 {
    public static void main(String[] args) {
        long l = 1234567890987654321L;
        int count=0;
        for(long i = l;i>0;i /= 10){
            count++;
        }
        System.out.println(count);
        String str = String.valueOf(l);
        System.out.println(str.length());
    }
}
