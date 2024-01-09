package MyIOStream.practice_04;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //创建数据源目录File对象
        File srcFolder = new File("D:\\OneDrive\\图片\\Saved Pictures");
        //获取数据源目录File对象的名称
        String srcFolderName = srcFolder.getName();//Saved Pictures
        //创建目的地目录file对象，
        File destFolder = new File("D:\\java_project\\study", srcFolderName);
        //判断目的地目录对应的file是否存在，如果不存在，就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        //获取数据源下的所有文件的file数组
        File[] listFiles = srcFolder.listFiles();
        //遍历file数组，得到每一个file对象，其实就是数据源文件
        for (File srcFile : listFiles) {
            //获取数据源文件file对象的名称
            String srcFileName = srcFile.getName();
            //创建目的地文件file对象，路径是目的地目录 + 文件名
            File destFile = new File(destFolder, srcFileName);
            //复制文件
            copyFile(srcFile, destFile);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bys)) != -1) {
            bufferedOutputStream.write(bys, 0, len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }

}
