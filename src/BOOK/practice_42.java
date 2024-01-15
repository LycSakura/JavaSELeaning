package BOOK;

/*大写转小写*/
public class practice_42 {
    public static void main(String[] args) {
        int num = 66;
        print(num);
    }

    public static void print(int num) {
        System.out.println((char) num);
        print((char) num);
    }

    public static void print(char ch) {
        char a = (char) ((char) (ch - 'A') + 'a');
        System.out.println(a);
    }

}
