package BOOK;

/*摄氏度转华氏度*/
public class comprehensive_exercise_15 {
    public static void main(String[] args) {
        int centigrade = -30;
        double fahrenheit;
        do {
            centigrade += 10;
            fahrenheit = centigrade * 9 / 5.0 + 32;
            System.out.println("摄氏温度" + centigrade + "C\t华氏温度" + fahrenheit + "F");
        } while (centigrade < 50);
    }
}
