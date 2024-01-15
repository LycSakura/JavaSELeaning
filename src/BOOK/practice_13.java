package BOOK;

/*蜗牛爬井*/
public class practice_13 {
    public static void main(String[] args) {
        int distance = 0;
        int day = 1;
        while (true) {
            distance += 2;
            if (distance >= 10) {
                break;
            }
            distance -= 1;
            day++;
        }
        System.out.println(day);
    }
}
