package passage_9;

/*中断循环*/
public class comprehensive_exerercise_5 {
    public static void main(String[] args) {
        int i;
        try {
            for (i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 2) {
                    throw new Exception("抛出异常,循环中断");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-------------");
        for (i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                if (i == 2) {
                    throw new Exception("抛出异常，循环不中断");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
