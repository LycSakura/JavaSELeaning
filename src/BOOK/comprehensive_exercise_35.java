package BOOK;

/*判断是否能构成三角形*/
public class comprehensive_exercise_35 {
    public static void main(String[] args) {
        Triangle s1 = new Triangle(3, 4, 5);
        Triangle s2 = new Triangle(1, 4, 5);
        s1.getC(s1);
        s2.getC(s2);
    }
}

abstract class SHape {
    abstract void getC(Triangle s);
}

class Triangle extends SHape {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void getC(Triangle s) {
        if (s.a + s.b > s.c && s.b + s.c > s.a && s.a + s.c > s.b) {
            System.out.println("长为" + s.a + "," + s.b + "," + s.c + "的3条边能构成三角形，这个三角形周长为" + (s.a + s.b + s.c));
        } else {
            System.out.println("长为" + s.a + "," + s.b + "," + s.c + "的3条边不能构成三角形，因为三角形两边之和必须大于第三边");
        }
    }
}

