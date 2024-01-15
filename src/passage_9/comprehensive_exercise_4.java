package passage_9;

/*除数不能为0*/
public class comprehensive_exercise_4 {
    public static class Division {
        static int num1 = 25;
        static int num2 = 0;
        static int result;

        public static void division() throws ArithmeticException {
            result = num1 / num2;
        }

        public static void main(String[] args) {
            try {
                division();
            } catch (ArithmeticException ae) {
                System.out.println("小学生都笑哭了:除数不能为0!!!");
            }
        }
    }
}
