package BOOK;

/*矩阵转置*/
public class comprehensive_exercise_18 {
    public static void main(String[] args) {
//        int[][] array = {{91, 25, 8}, {56, 14, 2}, {47, 3, 67}};
//        System.out.println("------转置前------");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("------转置后------");
//        for (int i = 0;i<array.length;i++){
//            for (int j=0;j<array.length;j++){
//                System.out.print(array[j][i]+"\t");
//            }
//            System.out.println();
//        }
        int[][] array = {{91, 25, 8}, {56, 14, 2}, {47, 3, 67}};
        System.out.println("------转置前------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println("------转置后------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
