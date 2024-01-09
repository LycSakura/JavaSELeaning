package BOOK;

/*百钱百鸡*/
public class comprehensive_exercise_16 {
    public static void main(String[] args) {
        for (int i = 100 / 5; i >= 0; i--) {
            for (int j = 100 / 3; j >= 0; j--) {
                int k = (100 - i * 5 - j * 3) * 3;
                if (i * 5 + j * 3 + k / 3 == 100 && i + j + k == 100) {
                    System.out.println("公鸡:" + i + "\t母鸡:" + j + "\t小鸡:" + k);
                }
            }
        }
//        int cock, hen, chick;
//        for (cock = 0; cock <= 20; cock++) {
//            for (hen = 0; hen <= 33; hen++) {
//                for (chick = 3; chick <= 99; chick += 3) {
//                    if (5 * cock + 3 * hen + chick / 3 == 100) {
//                        if (cock + hen + chick == 100) {
//                            System.out.println("公鸡:" + cock + "\t母鸡:" + hen + "\t小鸡:" + chick);
//                        }
//                    }
//                }
//            }
//        }
    }
}
