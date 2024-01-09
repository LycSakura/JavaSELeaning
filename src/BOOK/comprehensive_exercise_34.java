package BOOK;

/*抽象的图形*/
public class comprehensive_exercise_34 {
    public static void main(String[] args) {
        Rectangle s = new Rectangle("黄色", 6.0, 2.0);
        System.out.println("长为" + s.length + "宽为" + s.width + "的" + s.color + "长方形面积是" + s.getarea());
    }
}

abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract public double getarea();
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }


    @Override
    public double getarea() {
        return length * width;
    }
}
