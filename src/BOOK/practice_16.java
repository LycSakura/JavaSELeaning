package BOOK;

/*寻找空储物箱*/
public class practice_16 {
    public static void main(String[] args) {
        int[] totalNum = new int[20];
        int[] emptyNum = {2, 3, 5, 8, 12, 13, 16, 19, 20};
        System.out.println("总共有" + totalNum.length + "个箱子");
        System.out.println("尚未使用的储物箱:" + emptyNum.length + "个");
        System.out.println("已经使用的储物箱:" + (totalNum.length - emptyNum.length) + "个");
        totalNum.clone();
    }
}
