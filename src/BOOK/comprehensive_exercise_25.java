package BOOK;

/*英尺与厘米互换*/
public class comprehensive_exercise_25 {
    static double ratio = 2.54;

    public static double transferCM(double cm) {
        return cm / ratio;
    }

    public static double transferINCH(double inch) {
        return inch * ratio;
    }

    public static void main(String[] args) {
        System.out.println("10厘米换成英寸:" + transferCM(10));
        System.out.println("10英尺换成厘米:" + transferINCH(10));
    }
}
