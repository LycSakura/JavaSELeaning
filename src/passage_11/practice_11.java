package passage_11;

import java.io.IOException;

/*打开空记事本*/
public class practice_11 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try{
            r.exec("notepad");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
