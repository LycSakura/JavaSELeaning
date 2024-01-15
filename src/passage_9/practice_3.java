package passage_9;

import java.util.Scanner;

/*模拟老师上课点名过程*/
public class practice_3 {
    static void student(String name) throws MyException {
        if (name.equals("王五")) {
            throw new MyException("王五旷课");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("输入要点名的学生的名字:");
            String name = sc.next();
            student(name);
        } catch (MyException e) {
            System.out.println(e);
        } finally {
            System.out.println("点名完毕");
        }
    }
}

class MyException extends Exception {

    public MyException(String ErrorMessage) {
        super(ErrorMessage);
    }
}


