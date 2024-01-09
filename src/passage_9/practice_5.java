package passage_9;

/*没带车钥匙*/
public class practice_5 {
    public static void main(String[] args) {
        try {
            key();
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("没带钥匙");
        }finally {
            System.out.println("回去拿钥匙");
        }
    }

    static void key() throws NullPointerException {
        Object key = null;
        key.toString();
    }

}
