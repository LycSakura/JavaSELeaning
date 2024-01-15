package passage_11;
/*检验计算机是否联网*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class practice_12 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("ping www.baidu.com");
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
