package passage_15;

import java.io.File;

/*批量创建文件*/
public class practice_01 {
    public static void main(String[] args) {
        File dir = new File("D:\\test");
        if (!dir.exists()) {
            dir.mkdir();
        }
        for (int i = 1; i <= 20; i++) {
            File dirIner = new File(dir, String.valueOf(i));
            dirIner.mkdir();
        }
    }
}
