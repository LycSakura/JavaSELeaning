package passage_15;

import java.io.File;

/*列出C盘所有文件*/
public class practice_02 {
    public static void main(String[] args) {
        File dir = new File("C:\\Windows");
        File[] fs = dir.listFiles();
        for (File f : fs) {
            if (f.isFile()) {
                System.out.println("是标准文件");
            } else {
                System.out.println("不是标准文件");
            }
            System.out.println(f.getName() + "\n");
        }
    }
}
