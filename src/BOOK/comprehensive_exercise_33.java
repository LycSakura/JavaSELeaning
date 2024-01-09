package BOOK;

/*老虎机*/
public class comprehensive_exercise_33 {
    public static void main(String[] args) {
        Color color[] = {new Red(), new Yellow(), new Blue()};
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * 3);
            judge(color[index]);
        }
    }

    public static void judge(Color color) {
        if (color instanceof Red)
            System.out.print("红");
        if (color instanceof Yellow)
            System.out.print("黄");
        if (color instanceof Blue)
            System.out.print("蓝");
    }
}

class Color {

}

class Red extends Color {

}

class Yellow extends Color {

}

class Blue extends Color {

}
