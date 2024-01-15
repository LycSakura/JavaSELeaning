package BOOK;

/*交换数组*/
public class practice_24 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int temp;
        temp = a[0];
        a[0] = a[2];
        a[2] = temp;
        temp = a[1];
        a[1] = a[3];
        a[3] = temp;
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
