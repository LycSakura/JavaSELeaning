package BOOK;

/*求二元一次方程组*/
public class practice_06 {
    public static void main(String[] args) {
        double a = 21.8, b = 2, c = 7, d = 8, e = 28, f = 62;
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
