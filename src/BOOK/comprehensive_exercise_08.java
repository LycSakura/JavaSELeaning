package BOOK;

/*货车装西瓜*/
public class comprehensive_exercise_08 {
    public static void main(String[] args) {
        double l = 400, w = 160, h = 30;
        double r = 23;
        int lCount = (int) (l / r);
        int wCount = (int) (w / r);
        int hCount = (int) (h / r);
        System.out.println("满载时能装" + (lCount * wCount * hCount) + "个西瓜");
        System.out.println((lCount * wCount * hCount) > 100 ? "实际能装100个西瓜" : "实际能装" + (lCount * wCount * hCount) + "个西瓜");
    }
}
