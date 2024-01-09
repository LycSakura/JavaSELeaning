package BOOK;

/*输出古诗*/
public class practice_18 {
    public static void main(String[] args) {
//        char[][] poem = {{'春', '眠', '不', '绝', '晓', ',', '处', '处', '闻', '啼', '鸟', '.'},
//                {'夜', '来', '风', '雨', '声', ',', '画', '落', '知', '多', '少', '.'}};
//        int i, j, t=0;
//        for (i = 0; i < poem.length; i++) {
//            for (j = 0; j < poem[i].length; j++) {
//                System.out.print(poem[i][j]);
//                t++;
//            }
//            System.out.println();
//        }
//        for (j = 0; j < t/poem.length; j++) {
//            for (i = 0; i < poem.length; i++) {
//                System.out.print(poem[i][j]+" ");
//            }
//            System.out.println();
//        }
        char arr[][] = new char[4][];
        arr[0] = new char[]{'春', '眠', '不', '绝', '晓'};
        arr[1] = new char[]{'处', '处', '闻', '啼', '鸟'};
        arr[2] = new char[]{'夜', '来', '风', '雨', '声'};
        arr[3] = new char[]{'花', '落', '知', '多', '少'};
        System.out.println("-----横板-----");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            if (i % 2 == 0) {
                System.out.println(",");
            } else {
                System.out.println(".");
            }
        }
        System.out.println("\n-----竖版-----");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <4; i++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        arr.clone();
    }
}
